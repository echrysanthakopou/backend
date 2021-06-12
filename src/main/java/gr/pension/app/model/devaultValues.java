//package gr.beekeepingApp.model;
//
//import gr.beekeepingApp.model.entities.*;
//
//import java.sql.Date;
//
//
//public class devaultValues {
//    public devaultValues() {
//    }
//
//    private Integer id;
//    private Integer apiariesId;
//    private Date createdate;
//    private Date diseased;
//    private String currentstatus;
//    private String details;
//    private UsersEntity usersByUsersId;
//    private QueenEntity queenByQueenId;
//    private Date insDate;
//    private String insBasilikaKelia;
//    private String insCellGono;
//    private String insCellGiri;
//    private String insHoney;
//    private String insEmptyCells;
//    private String logos;
//    private DiseaseEntity disease;
//    private FeedingEntity feeding;
//    private DiaphragmEntity diaphragm;
//    private PollencollectorEntity pollen;
//    private BeeglueEntity glue;
//    private Date afanismos;
//    private String info;
//    private HarvestEntity harvestEntity;
//    private String previous;
//    private String next;
//
//    private String insGonos;
//    private String insSxino;
//    private Date insDateSxino;
//    private String insTotal;
//
//    @Override
//    public String toString() {
//        return "devaultValues{" +
//                "id=" + id +
//                ", apiariesId=" + apiariesId +
//                ", createdate=" + createdate +
//                ", diseased=" + diseased +
//                ", currentstatus='" + currentstatus + '\'' +
//                ", details='" + details + '\'' +
//                ", usersByUsersId=" + usersByUsersId +
//                ", queenByQueenId=" + queenByQueenId +
//                ", insDate=" + insDate +
//                ", insBasilikaKelia='" + insBasilikaKelia + '\'' +
//                ", insCellGono='" + insCellGono + '\'' +
//                ", insCellGiri='" + insCellGiri + '\'' +
//                ", insHoney='" + insHoney + '\'' +
//                ", insEmptyCells='" + insEmptyCells + '\'' +
//                ", logos='" + logos + '\'' +
//                ", disease=" + disease +
//                ", feeding=" + feeding +
//                ", diaphragm=" + diaphragm +
//                ", pollen=" + pollen +
//                ", glue=" + glue +
//                ", afanismos=" + afanismos +
//                ", info='" + info + '\'' +
//                ", harvestEntity=" + harvestEntity +
//                ", previous='" + previous + '\'' +
//                ", next='" + next + '\'' +
//                ", insGonos='" + insGonos + '\'' +
//                ", insSxino='" + insSxino + '\'' +
//                ", insDateSxino='" + insDateSxino + '\'' +
//                ", insTotal='" + insTotal + '\'' +
//                '}';
//    }
//
//    public devaultValues(Integer id, Integer apiariesId, Date createdate, Date diseased, String currentstatus, String details, UsersEntity usersByUsersId, QueenEntity queenByQueenId, Date insDate, String insBasilikaKelia, String insCellGono, String insCellGiri, String insHoney, String insEmptyCells, String logos, DiseaseEntity disease, FeedingEntity feeding, DiaphragmEntity diaphragm, PollencollectorEntity pollen, BeeglueEntity glue, Date afanismos, String info, HarvestEntity harvestEntity, String previous, String next, String insGonos, String insSxino, Date insDateSxino, String insTotal) {
//        this.id = id;
//        this.apiariesId = apiariesId;
//        this.createdate = createdate;
//        this.diseased = diseased;
//        this.currentstatus = currentstatus;
//        this.details = details;
//        this.usersByUsersId = usersByUsersId;
//        this.queenByQueenId = queenByQueenId;
//        this.insDate = insDate;
//        this.insBasilikaKelia = insBasilikaKelia;
//        this.insCellGono = insCellGono;
//        this.insCellGiri = insCellGiri;
//        this.insHoney = insHoney;
//        this.insEmptyCells = insEmptyCells;
//        this.logos = logos;
//        this.disease = disease;
//        this.feeding = feeding;
//        this.diaphragm = diaphragm;
//        this.pollen = pollen;
//        this.glue = glue;
//        this.afanismos = afanismos;
//        this.info = info;
//        this.harvestEntity = harvestEntity;
//        this.previous = previous;
//        this.next = next;
//        this.insGonos = insGonos;
//        this.insSxino = insSxino;
//        this.insDateSxino = insDateSxino;
//        this.insTotal = insTotal;
//    }
//
//    public String getInsGonos() {
//        return insGonos;
//    }
//
//    public void setInsGonos(String insGonos) {
//        this.insGonos = insGonos;
//    }
//
//    public String getInsSxino() {
//        return insSxino;
//    }
//
//    public void setInsSxino(String insSxino) {
//        this.insSxino = insSxino;
//    }
//
//    public Date getInsDateSxino() {
//        return insDateSxino;
//    }
//
//    public void setInsDateSxino(Date insDateSxino) {
//        this.insDateSxino = insDateSxino;
//    }
//
//    public String getInsTotal() {
//        return insTotal;
//    }
//
//    public void setInsTotal(String insTotal) {
//        this.insTotal = insTotal;
//    }
//
//    public String getPrevious() {
//        return previous;
//    }
//
//    public void setPrevious(String previous) {
//        this.previous = previous;
//    }
//
//    public String getNext() {
//        return next;
//    }
//
//    public void setNext(String next) {
//        this.next = next;
//    }
//
//    public HarvestEntity getHarvestEntity() {
//        return harvestEntity;
//    }
//
//    public void setHarvestEntity(HarvestEntity harvestEntity) {
//        this.harvestEntity = harvestEntity;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getApiariesId() {
//        return apiariesId;
//    }
//
//    public void setApiariesId(Integer apiariesId) {
//        this.apiariesId = apiariesId;
//    }
//
//    public Date getCreatedate() {
//        return createdate;
//    }
//
//    public void setCreatedate(Date createdate) {
//        this.createdate = createdate;
//    }
//
//    public Date getDiseased() {
//        return diseased;
//    }
//
//    public void setDiseased(Date diseased) {
//        this.diseased = diseased;
//    }
//
//    public String getCurrentstatus() {
//        return currentstatus;
//    }
//
//    public void setCurrentstatus(String currentstatus) {
//        this.currentstatus = currentstatus;
//    }
//
//    public String getDetails() {
//        return details;
//    }
//
//    public void setDetails(String details) {
//        this.details = details;
//    }
//
//    public UsersEntity getUsersByUsersId() {
//        return usersByUsersId;
//    }
//
//    public void setUsersByUsersId(UsersEntity usersByUsersId) {
//        this.usersByUsersId = usersByUsersId;
//    }
//
//    public QueenEntity getQueenByQueenId() {
//        return queenByQueenId;
//    }
//
//    public void setQueenByQueenId(QueenEntity queenByQueenId) {
//        this.queenByQueenId = queenByQueenId;
//    }
//
//    public Date getInsDate() {
//        return insDate;
//    }
//
//    public void setInsDate(Date insDate) {
//        this.insDate = insDate;
//    }
//
//    public String getInsBasilikaKelia() {
//        return insBasilikaKelia;
//    }
//
//    public void setInsBasilikaKelia(String insBasilikaKelia) {
//        this.insBasilikaKelia = insBasilikaKelia;
//    }
//
//    public String getInsCellGono() {
//        return insCellGono;
//    }
//
//    public void setInsCellGono(String insCellGono) {
//        this.insCellGono = insCellGono;
//    }
//
//    public String getInsCellGiri() {
//        return insCellGiri;
//    }
//
//    public void setInsCellGiri(String insCellGiri) {
//        this.insCellGiri = insCellGiri;
//    }
//
//    public String getInsHoney() {
//        return insHoney;
//    }
//
//    public void setInsHoney(String insHoney) {
//        this.insHoney = insHoney;
//    }
//
//    public String getInsEmptyCells() {
//        return insEmptyCells;
//    }
//
//    public void setInsEmptyCells(String insEmptyCells) {
//        this.insEmptyCells = insEmptyCells;
//    }
//
//    public String getLogos() {
//        return logos;
//    }
//
//    public void setLogos(String logos) {
//        this.logos = logos;
//    }
//
//    public DiseaseEntity getDisease() {
//        return disease;
//    }
//
//    public void setDisease(DiseaseEntity disease) {
//        this.disease = disease;
//    }
//
//    public FeedingEntity getFeeding() {
//        return feeding;
//    }
//
//    public void setFeeding(FeedingEntity feeding) {
//        this.feeding = feeding;
//    }
//
//    public DiaphragmEntity getDiaphragm() {
//        return diaphragm;
//    }
//
//    public void setDiaphragm(DiaphragmEntity diaphragm) {
//        this.diaphragm = diaphragm;
//    }
//
//    public PollencollectorEntity getPollen() {
//        return pollen;
//    }
//
//    public void setPollen(PollencollectorEntity pollen) {
//        this.pollen = pollen;
//    }
//
//    public BeeglueEntity getGlue() {
//        return glue;
//    }
//
//    public void setGlue(BeeglueEntity glue) {
//        this.glue = glue;
//    }
//
//    public Date getAfanismos() {
//        return afanismos;
//    }
//
//    public void setAfanismos(Date afanismos) {
//        this.afanismos = afanismos;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }
//}
