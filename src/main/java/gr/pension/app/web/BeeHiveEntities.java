//package gr.beekeepingApp.web;
//
//
//import gr.beekeepingApp.dao.*;
//import InsDetails;
//import gr.beekeepingApp.model.devaultValues;
//import gr.beekeepingApp.model.entities.*;
//import insceptionReport;
//import reques2GetData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.util.Comparator;
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class BeeHiveEntities {
//    // @Autowired
//    //private UserDAO userDao;
//
//    @Autowired
//    private BeeHiveDAO dao;
//    @Autowired
//    private QueenDao queenDao;
//    @Autowired
//    private InsDao insDao;
//    @Autowired
//    private DiseaseDao diseaseDao;
//    @Autowired
//    private FeedingDao feedingDao;
//    @Autowired
//    private DiafragmaDao diafragmaDao;
//    @Autowired
//    private PollenCollectorDao pollenCollectorDao;
//    @Autowired
//    private BeeGlueDao beeGlueDao;
//    @Autowired
//    private UsersDAO userDao;
//
//    @Autowired
//    private HarvestDao harvestDao;
//
//    int queenCounter = 45;
//
//    @ResponseBody
//    @PostMapping(value = "/get")
//    public devaultValues get(@RequestBody reques2GetData data) {
//
//        String id = data.getBeehive();
//        String insID = data.getInsID();
//
//        System.out.println(" id " + id + " insID" + insID);
//        List<BeehivesEntity> listBeeHives = dao.findAll();
//        for (BeehivesEntity curEntity : listBeeHives) {
//            System.out.println("40 " + curEntity.getApiariesId().toString());
//            if (curEntity.getApiariesId() == Integer.parseInt(id)) {
//                System.out.println("43");
//                devaultValues d1 = new devaultValues();
//
////                if (d1.getDiseased()!=null) {
////                    d1.setAfanismos(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
////                }
//
//                if (d1.getCreatedate()==null) {
//                  //  d1.setCreatedate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//                }
//
//                d1.setApiariesId(curEntity.getApiariesId());
//                if(curEntity.getCreatedate()!=null) {
//                    d1.setCreatedate(curEntity.getCreatedate());
//                }else
//                {
//                   // d1.setCreatedate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//
//                }
//                d1.setCurrentstatus(curEntity.getCurrentstatus());
//                d1.setDetails(curEntity.getDetails());
//                if (curEntity.getDiseased()!=null) {
//                    d1.setAfanismos(curEntity.getDiseased());
//                }
////                else
////                {
////                    d1.setAfanismos(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
////                }
//                //d1.setQueenByQueenId(queenDao.findById(curEntity));
//                if (curEntity.getQueenByQueenId() != null) {
//                    d1.setQueenByQueenId(curEntity.getQueenByQueenId());
//                } else {
//                    d1.setQueenByQueenId(new QueenEntity());
//                }
//                System.out.println("50");
//                InspectionEntity ins = null;
//                if (insID.equals("latest")) {
//                    List<InspectionEntity> list = insDao.findByBeehivesByBeehivesId(curEntity);
//                    list.sort(Comparator.comparing(InspectionEntity::getDate));
//                    ins = list.get(list.size() - 1);
//                    d1.setInsDate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//
//
//
//                } else {
//                    ins = insDao.findById(Integer.parseInt(insID)).orElse(null);
//                }
//                d1.setInsBasilikaKelia(ins.getQueensCell());
//                System.out.println("54");
//                if (ins.getFramesPollen() != null)
//                    d1.setInsCellGono(ins.getFramesPollen().toString());
//
//                if (ins.getFramesOffsprings() != null)
//                    d1.setInsCellGiri(ins.getFramesOffsprings().toString());
//                System.out.println("57");
//                if (ins.getFramesHoney() != null)
//                    d1.setInsHoney(ins.getFramesHoney().toString());
//                if (ins.getFramesEmpty() != null)
//                    d1.setInsEmptyCells(ins.getFramesEmpty().toString());
//                if (ins.getQueensCellReason() != null)
//                    d1.setLogos(ins.getQueensCellReason());
//
//                if (ins.getDate() != null) {
//                    d1.setInsDate(ins.getDate());
//                } else {
//                    System.out.println("---------------Current Date----------------------");
//                    d1.setInsDate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//                }
//
//                if (ins.getDiseaseByDiseaseId() != null) {
//                    d1.setDisease(ins.getDiseaseByDiseaseId());
//                } else {
//                    d1.setDisease(new DiseaseEntity());
//                }
//
//                if (ins.getFeedingByFeedingId() != null) {
//                    d1.setFeeding(ins.getFeedingByFeedingId());
//                } else {
//                    d1.setFeeding(new FeedingEntity());
//                }
//
//                if( ins.getGono()!=null)
//                {
//                    d1.setInsGonos(ins.getGono());
//                }
//                if(ins.getSxino()!=null){
//                    d1.setInsSxino(ins.getSxino());
//                }
//                if(ins.getSxinoDate()!=null)
//                {
//                    d1.setInsDateSxino(ins.getSxinoDate());
//                }
//                else
//                {
//                    d1.setInsDateSxino(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//                }
//                if(ins.getFramesTotal()!=null)
//                {
//                    d1.setInsTotal(ins.getFramesTotal().toString());
//                }
//                if (ins.getDiaphragmByDiaphragmId() != null) {
//                    d1.setDiaphragm(ins.getDiaphragmByDiaphragmId());
//                } else {
//                    d1.setDiaphragm(new DiaphragmEntity());
//                }
//
//                if (ins.getPollencollectorId() != null) {
//                    d1.setPollen(ins.getPollencollectorId());
//                } else {
//                    d1.setPollen(new PollencollectorEntity());
//                }
//
//                if (ins.getBeeglueByBeeGlueId() != null) {
//                    d1.setGlue(ins.getBeeglueByBeeGlueId());
//                } else {
//                    d1.setGlue(new BeeglueEntity());
//                }
//
//                if (ins.getInfo() != null) {
//                    d1.setInfo(ins.getInfo());
//                }
//
//
//                if (ins.getHarvestByHarvestId() != null) {
//                    d1.setHarvestEntity(ins.getHarvestByHarvestId());
//                } else {
//                    d1.setHarvestEntity(new HarvestEntity());
//                }
//
//                int posIns = 0;
//                int previous = 0;
//                int nextIns = 0;
//
//                if (ins != null) {
//
//                    List<InspectionEntity> list = insDao.findByBeehivesByBeehivesId(curEntity);
//                    list.sort(Comparator.comparing(InspectionEntity::getDate));
//
//                    if (list.size() == 1) {
//                        previous = 0;
//                        nextIns = 0;
//                    } else {
//                        //ins = list.get(list.size() - 1);
//                        int i = 0;
//                        for (InspectionEntity insCur : list) {
//                            System.out.println("Current id " + insCur.getId());
//                            if (ins.getId().equals(insCur.getId())) {
//                                System.out.println("--equals");
//
//                                if (i <= 0) {
//
//                                    previous = 0;
//                                    nextIns = list.get(i + 1).getId();
//                                } else if (i >= (list.size() - 1)) {
//                                    nextIns = 0;
//                                    previous = list.get(i - 1).getId();
//                                } else {
//                                    previous = list.get(i - 1).getId();
//                                    nextIns = list.get(i + 1).getId();
//                                }
//                            }
//                            i++;
//                        }
//                    }
//                } else {
//
//                }
//                d1.setPrevious((String.valueOf(previous)));
//                d1.setNext(String.valueOf(nextIns));
//
//                System.out.println("About to return " + previous + " " + nextIns);
//                System.out.println("Return values " + d1.toString());
//
//                System.out.println("----------------------------");
//                if (insID.equals("latest")) {
//                    //List<InspectionEntity> list = insDao.findByBeehivesByBeehivesId(curEntity);
//                    //list.sort(Comparator.comparing(InspectionEntity::getDate));
//                    //ins=list.get(list.size()-1);
//                    d1.setInsDate(new Date(LocalDate.now().getYear() - 1900, LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth()));
//
//                }
//
//                if (d1.getInsDate()==null)
//                {
//                    d1.setInsDate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//
//                }
//                System.out.println("----------------------------" + LocalDate.now().getYear() + " " + LocalDate.now().getMonthValue() + " " + LocalDate.now().getDayOfMonth());
//
//                //devaultValues d1 = new devaultValues();
//
////                if (d1.getDiseased()!=null) {
////                    d1.setAfanismos(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
////                }
//
//                if (d1.getCreatedate()==null) {
//                   // d1.setCreatedate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//                }
//
//                return d1;
//            }
//
//        }
//
//
//
//        devaultValues d1 = new devaultValues();
//        d1.setQueenByQueenId(new QueenEntity());
//        d1.setDisease(new DiseaseEntity());
//        d1.setFeeding(new FeedingEntity());
//        d1.setHarvestEntity(new HarvestEntity());
//        d1.setGlue(new BeeglueEntity());
//        d1.setPollen(new PollencollectorEntity());
//        d1.setFeeding(new FeedingEntity());
//        d1.setDiaphragm(new DiaphragmEntity());
//
//        if (d1.getDiseased()!=null) {
//            d1.setAfanismos(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//        }
//
//        if (d1.getCreatedate()!=null) {
//            d1.setCreatedate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//        }
//
//        if (d1.getInsDate()==null)
//        {
//            d1.setInsDate(new Date(LocalDate.now().getYear() -1900, LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth()));
//
//        }
//        //System.out.println("Degub msg login Data to String  "+  dao.findById(Integer.parseInt(id)).orElse(null).toString());
//        return d1;
//
//
//    }
//
//
//    @ResponseBody
//    @PostMapping(value = "/ins1", headers = "Accept=application/x-www-form-urlencoded;charset=UTF-8")
//
//    public void inspectionR(@RequestBody insceptionReport report) {
//
//        System.out.println(" id " + report.toString());
//
//        //boolean flagNew=true;
//        BeehivesEntity beeHive = new BeehivesEntity();
//        InspectionEntity ins;
////        if (!report.getInspectonCode().equals("latest")) {
////            System.out.println("Inspection Code " + report.getInspectonCode());
////            ins = insDao.findById(Integer.parseInt(report.getInspectonCode())).orElse(new InspectionEntity());
////        } else
//        if (report.getInsDate() != null) {
//
//            ins = insDao.findAllByDate(report.getInsDate()).orElse(new InspectionEntity());
//
//
//            if (ins.getBeehivesByBeehivesId() != null) {
//                if (ins.getBeehivesByBeehivesId().getApiariesId() != Integer.parseInt(report.getBasicNumberBeeHive())) {
//                    ins = new InspectionEntity();
//                }
//            }
//        } else {
//
//            System.out.println("Inspection Code " + report.getInspectonCode());
//            ins = new InspectionEntity();
//        }
//
//
//        boolean flagNew = true;
//
//        List<BeehivesEntity> listBeeHives = dao.findAll();
//        for (BeehivesEntity curEntity : listBeeHives) {
//            if (curEntity.getApiariesId() == Integer.parseInt(report.getBasicNumberBeeHive())) {
//                flagNew = false;
//                beeHive = curEntity;
//                System.out.println("Existingggg");
//            }
//        }
//
//        if (flagNew == true) {
//            beeHive.setUsersByUsersId(userDao.findById(UserController.user).orElse(null));
//        }
//
//        if (report.getBasicInfoImerominiaDimiourgia() != null) {
//            beeHive.setCreatedate(report.getBasicInfoImerominiaDimiourgia());
//        }
//
//        if (report.getBasicNameBeeHive() != null) {
//            beeHive.setDetails(report.getBasicNameBeeHive());
//        }
//
//        if (report.getBasicNumberBeeHive() != null) {
//            beeHive.setApiariesId(Integer.parseInt(report.getBasicNumberBeeHive()));
//        }
//
//        if (report.getBasikilaKelliaTroposDhmiourgia() != null) {
//            beeHive.setCurrentstatus(report.getBasikilaKelliaTroposDhmiourgia());
//        }
//
//        if (report.getMoreDetail6().equals("true")) {
//            System.out.println("  "+report.getMoreDetail6());
//            beeHive.setDiseased(report.getAfanismosDate());
//        }
//        else
//        {
//            beeHive.setDiseased(null);
//        }
//
//        QueenEntity q1;
//        boolean newQueenFlag = false;
//
//        if (beeHive.getQueenByQueenId() == null) {
//            q1 = new QueenEntity();
//        } else {
//            q1 = beeHive.getQueenByQueenId();
//            System.out.println("Existing Queen");
//        }
//
//        if (report.getManaHmeromhnia() != null) {
//            q1.setCreateddate(report.getManaHmeromhnia());
//            newQueenFlag = true;
//        }
//
//
//        if (report.getManaIkanothta() != null) {
//            q1.setAbility(report.getManaIkanothta());
//            newQueenFlag = true;
//        }
//
//
//        if (report.getManaGonoimopoihmenh() != null) {
//            q1.setFertilized(report.getManaGonoimopoihmenh());
//            newQueenFlag = true;
//        }
//
//
//        if (report.getManaKatastash() != null) {
//            q1.setStatus(report.getManaKatastash());
//            newQueenFlag = true;
//        }
//
//
//        if (report.getMamaOptionsDimiourgia() != null) {
//            q1.setQueencol(report.getMamaOptionsDimiourgia());
//            newQueenFlag = true;
//        }
//
//        if (newQueenFlag == true && beeHive.getQueenByQueenId() == null) {
//            queenDao.save(q1);
//            beeHive.setQueenByQueenId(q1);
//        }
//        //System.out.println("Degub msg login Data to String  "+  dao.findById(Integer.parseInt(id)).orElse(null).toString());
//        ///  null;
//
//
//        //q1=queenDao.save(q1);
//        if (report.getInsDate() != null)
//            ins.setDate(report.getInsDate());
//        if (report.getInsHoney() != null)
//            ins.setFramesHoney(Integer.parseInt(report.getInsHoney()));
//        if (report.getInsCellGiri() != null)
//            ins.setFramesPollen(Integer.parseInt(report.getInsCellGiri()));
//        if (report.getInsCellGono() != null)
//            ins.setFramesOffsprings(Integer.parseInt(report.getInsCellGono()));
//        if (report.getInsEmptyCells() != null)
//            ins.setFramesEmpty(Integer.parseInt(report.getInsEmptyCells()));
//        ins.setBeehivesByBeehivesId(beeHive);
//        if (report.getInsBasilikaKelia() != null)
//            ins.setQueensCell(report.getInsBasilikaKelia());
//        if (report.getInsLogoDhmiourgiasBasilikonKelio() != null)
//            ins.setQueensCellReason(report.getInsLogoDhmiourgiasBasilikonKelio());
//        if (report.getInfo() != null)
//            ins.setInfo(report.getInfo());
//        if(report.getInsGonos()!=null)
//        {
//            ins.setGono(report.getInsGonos());
//        }
//        if(report.getInsSxino()!=null)
//        {
//            ins.setSxino(report.getInsSxino());
//        }
//        if(report.getInsDateSxino()!=null)
//        {
//            ins.setSxinoDate(report.getInsDateSxino());
//        }
//        if(report.getInsTotal()!=null)
//        {
//            if(!report.getInsTotal().equals("")) {
//                ins.setFramesTotal(Integer.parseInt(report.getInsTotal()));
//            }
//        }
//
//        DiseaseEntity d1 = new DiseaseEntity();
//        boolean newDiease = false;
//        if (report.getIllBarroa() != null) {
//
//            d1.setName(report.getIllBarroa());
//            newDiease = true;
//
//        }
//        if (report.getIllTropowEfarmogiw() != null) {
//            d1.setTreatmentmethod(report.getIllTropowEfarmogiw());
//
//            newDiease = true;
//        }
//
//        if (report.getIllFarmakoGiaBarroa() != null) {
//            d1.setTreatment(report.getIllFarmakoGiaBarroa());
//            newDiease = true;
//        }
//
//        if (report.getIlldeployFarkakoGiaBalboa() != null) {
//            d1.setDate(report.getIlldeployFarkakoGiaBalboa());
//        }
//
//
//        if (newDiease) {
//            diseaseDao.save(d1);
//            ins.setDiseaseByDiseaseId(d1);
//        }
//
//        if (report.getTrofodosiaFlag() != null) {
//            FeedingEntity f1 = new FeedingEntity();
//
//            f1.setDate(report.getTrofodosiaDate());
//            f1.setProduct(report.getTrofodosiaEidos());
//            f1.setDate(report.getTrofodosiaDate());
//            f1.setQuantity(Double.parseDouble(report.getTrofodosiaPosotita()));
//
//            feedingDao.save(f1);
//            ins.setFeedingByFeedingId(f1);
//        }
//
//        if (report.getDiafragmaFlag() != null) {
//            DiaphragmEntity f1 = new DiaphragmEntity();
//
//            f1.setDate(report.getDiafragmaDate());
//            f1.setDateRemoved(report.getDiafragmaDateRemove());
//            f1.setDate(report.getTrofodosiaDate());
//            f1.setCreatedmethod(report.getDiagragmaTroposDhmiourgia());
//
//            diafragmaDao.save(f1);
//            ins.setDiaphragmByDiaphragmId(f1);
//        }
//
//
//        if (report.getGirotopothetisiFlag() != null) {
//            PollencollectorEntity p1 = new PollencollectorEntity();
//
//            p1.setDatePlacement(report.getGiroDate());
//            p1.setDateRemoved(report.getGiroDateRemove());
//            p1.setPollen(Double.parseDouble(report.getGiroAmount()));
//
//            pollenCollectorDao.save(p1);
//            ins.setPollencollectorId(p1);
//        }
//
//        if (report.getSitiaFlag() != null) {
//            BeeglueEntity p1 = new BeeglueEntity();
//
//            p1.setDate(report.getSitiaDate());
//            p1.setRemovedate(report.getSitiaDateRemove());
//            p1.setWeight(Double.parseDouble(report.getSitiaPosotita()));
//            System.out.println("----------------- ");
//            beeGlueDao.save(p1);
//            ins.setBeeglueByBeeGlueId(p1);
//        }
//
//
//        if (report.getTrigosApodosiXronias() != null) {
//            HarvestEntity p1 = new HarvestEntity();
//
//            p1.setDate(report.getTrigosDate());
//            p1.setFrameshoney((report.getTrigosPlaisioMeli()));
//            p1.setPerfomance(report.getTrigosApodosiXronias());
//            p1.setPlant(report.getTrigosFito());
//            p1.setWeighthoney(report.getTrigosPlaisioMeliKila());
//
//            System.out.println("----------------- ");
//            harvestDao.save(p1);
//            ins.setHarvestByHarvestId(p1);
//        }
//        //ins.setId(0);
//        //insDao.save(ins);
//        //q1=queenDao.save(q1);
//
//
//        dao.save(beeHive);
//
//        ins.setBeehivesByBeehivesId(beeHive);
//
//        insDao.save(ins);
//
//    }
//
//
//    @ResponseBody
//    @PostMapping(value = "/delete")
//
//    public void delete(@RequestBody String id) {
//
//
//        System.out.println(" id " + id.toString());
//
//        BeehivesEntity b1 = dao.findByApiariesId(Integer.parseInt(id));
//
//        b1.setUsersByUsersId(null);
//        dao.save(b1);
//    }
//
//
//    @ResponseBody
//    @PostMapping(value = "/deleteIns")
//
//    public void deleteIns(@RequestBody String id) {
//
//        System.out.println(" id " + id.toString());
//
//        InspectionEntity ins1 = insDao.findById(Integer.parseInt(id)).orElse(null);
//
//
//        insDao.delete(ins1);
//    }
//
//
//    @ResponseBody
//    @PostMapping(value = "/insDetails")
//
//    public InsDetails getInsDetails(@RequestBody String id) {
//
//        System.out.println(" id " + id.toString());
//
//        InspectionEntity ins = insDao.findById(Integer.parseInt(id)).orElse(null);
//
//        InsDetails details = new InsDetails();
//        details.setFramePollen(ins.getFramesPollen().toString());
//        details.setFramesEmpty(ins.getFramesEmpty().toString());
//
//        details.setFramesOffsprings(ins.getFramesOffsprings().toString());
//        details.setFramesHoney(ins.getFramesHoney().toString());
//        //InspectionEntity ins1=insDao.findById(Integer.parseInt(id)).orElse(null);
//
//
//        return details;
//    }
//
//
//}