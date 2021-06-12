package gr.pension.app.model;

import java.sql.Date;

public class insceptionReport {

    // private String BasicInfoImerominiaDimiourgia;//undefined
    private String basicNameBeeHive;// "name from the db";
    private String basicNumberBeeHive;// "1"
    private String basikilaKelliaTroposDhmiourgia;
    private Date basicInfoImerominiaDimiourgia;

    private String mamaOptionsDimiourgia;
    private String manaIkanothta;
    private String manaGonoimopoihmenh;
    private Date manaHmeromhnia;
    private String  manaKatastash;

    private Date insDate;
    private String insBasilikaKelia;
    private String insCellGono;
    private String insCellGiri;
    private String insHoney;
    private String insEmptyCells;
    private String moreDetail6;
    private String insLogoDhmiourgiasBasilikonKelio;
    private String illFarmakoGiaBarroa;
    private String illTropowEfarmogiw;
    private String illBarroa;
    private Date  illdeployFarkakoGiaBalboa;
    private String trofodosiaPosotita;
    private String trofodosiaFlag;
    private Date trofodosiaDate;
    private String trofodosiaEidos;

    private String diafragmaFlag;
    private Date diafragmaDate;
    private String diagragmaTroposDhmiourgia;
    private String  diafragmaDateRemove;



    private Date giroDate;
    private String girotopothetisiFlag;
    private String giroAmount;
    private Date giroDateRemove;

    private String sitiaFlag;
    private Date sitiaDate;
    private String sitiaPosotita;
    private Date sitiaDateRemove;

    private String trigosDate;
    private String trigosFito;
    private String trigosPlaisioMeli;
    private String trigosPlaisioMeliKila;
    private String trigosApodosiXronias;

    private Date afanismosDate;

    private String info;

   private String inspectonCode;


   private String insGonos;
   private String insSxino;
   private Date insDateSxino;
   private String insTotal;

    @Override
    public String toString() {
        return "insceptionReport{" +
                "basicNameBeeHive='" + basicNameBeeHive + '\'' +
                ", basicNumberBeeHive='" + basicNumberBeeHive + '\'' +
                ", basikilaKelliaTroposDhmiourgia='" + basikilaKelliaTroposDhmiourgia + '\'' +
                ", basicInfoImerominiaDimiourgia=" + basicInfoImerominiaDimiourgia +
                ", mamaOptionsDimiourgia='" + mamaOptionsDimiourgia + '\'' +
                ", manaIkanothta='" + manaIkanothta + '\'' +
                ", manaGonoimopoihmenh='" + manaGonoimopoihmenh + '\'' +
                ", manaHmeromhnia=" + manaHmeromhnia +
                ", manaKatastash='" + manaKatastash + '\'' +
                ", insDate=" + insDate +
                ", insBasilikaKelia='" + insBasilikaKelia + '\'' +
                ", insCellGono='" + insCellGono + '\'' +
                ", insCellGiri='" + insCellGiri + '\'' +
                ", insHoney='" + insHoney + '\'' +
                ", insEmptyCells='" + insEmptyCells + '\'' +
                ", moreDetail6='" + moreDetail6 + '\'' +
                ", insLogoDhmiourgiasBasilikonKelio='" + insLogoDhmiourgiasBasilikonKelio + '\'' +
                ", illFarmakoGiaBarroa='" + illFarmakoGiaBarroa + '\'' +
                ", illTropowEfarmogiw='" + illTropowEfarmogiw + '\'' +
                ", illBarroa='" + illBarroa + '\'' +
                ", illdeployFarkakoGiaBalboa=" + illdeployFarkakoGiaBalboa +
                ", trofodosiaPosotita='" + trofodosiaPosotita + '\'' +
                ", trofodosiaFlag='" + trofodosiaFlag + '\'' +
                ", trofodosiaDate=" + trofodosiaDate +
                ", trofodosiaEidos='" + trofodosiaEidos + '\'' +
                ", diafragmaFlag='" + diafragmaFlag + '\'' +
                ", diafragmaDate=" + diafragmaDate +
                ", diagragmaTroposDhmiourgia='" + diagragmaTroposDhmiourgia + '\'' +
                ", diafragmaDateRemove='" + diafragmaDateRemove + '\'' +
                ", giroDate=" + giroDate +
                ", girotopothetisiFlag='" + girotopothetisiFlag + '\'' +
                ", giroAmount='" + giroAmount + '\'' +
                ", giroDateRemove=" + giroDateRemove +
                ", sitiaFlag='" + sitiaFlag + '\'' +
                ", sitiaDate=" + sitiaDate +
                ", sitiaPosotita='" + sitiaPosotita + '\'' +
                ", sitiaDateRemove=" + sitiaDateRemove +
                ", trigosDate='" + trigosDate + '\'' +
                ", trigosFito='" + trigosFito + '\'' +
                ", trigosPlaisioMeli='" + trigosPlaisioMeli + '\'' +
                ", trigosPlaisioMeliKila='" + trigosPlaisioMeliKila + '\'' +
                ", trigosApodosiXronias='" + trigosApodosiXronias + '\'' +
                ", afanismosDate=" + afanismosDate +
                ", info='" + info + '\'' +
                ", inspectonCode='" + inspectonCode + '\'' +
                ", insGonos='" + insGonos + '\'' +
                ", insSxino='" + insSxino + '\'' +
                ", insDateSxino=" + insDateSxino +
                ", insTotal='" + insTotal + '\'' +
                '}';
    }

    public insceptionReport(String basicNameBeeHive, String basicNumberBeeHive, String basikilaKelliaTroposDhmiourgia, Date basicInfoImerominiaDimiourgia, String mamaOptionsDimiourgia, String manaIkanothta, String manaGonoimopoihmenh, Date manaHmeromhnia, String manaKatastash, Date insDate, String insBasilikaKelia, String insCellGono, String insCellGiri, String insHoney, String insEmptyCells, String moreDetail6, String insLogoDhmiourgiasBasilikonKelio, String illFarmakoGiaBarroa, String illTropowEfarmogiw, String illBarroa, Date illdeployFarkakoGiaBalboa, String trofodosiaPosotita, String trofodosiaFlag, Date trofodosiaDate, String trofodosiaEidos, String diafragmaFlag, Date diafragmaDate, String diagragmaTroposDhmiourgia, String diafragmaDateRemove, Date giroDate, String girotopothetisiFlag, String giroAmount, Date giroDateRemove, String sitiaFlag, Date sitiaDate, String sitiaPosotita, Date sitiaDateRemove, String trigosDate, String trigosFito, String trigosPlaisioMeli, String trigosPlaisioMeliKila, String trigosApodosiXronias, Date afanismosDate, String info, String inspectonCode, String insGonos, String insSxino, Date insDateSxino, String insTotal) {
        this.basicNameBeeHive = basicNameBeeHive;
        this.basicNumberBeeHive = basicNumberBeeHive;
        this.basikilaKelliaTroposDhmiourgia = basikilaKelliaTroposDhmiourgia;
        this.basicInfoImerominiaDimiourgia = basicInfoImerominiaDimiourgia;
        this.mamaOptionsDimiourgia = mamaOptionsDimiourgia;
        this.manaIkanothta = manaIkanothta;
        this.manaGonoimopoihmenh = manaGonoimopoihmenh;
        this.manaHmeromhnia = manaHmeromhnia;
        this.manaKatastash = manaKatastash;
        this.insDate = insDate;
        this.insBasilikaKelia = insBasilikaKelia;
        this.insCellGono = insCellGono;
        this.insCellGiri = insCellGiri;
        this.insHoney = insHoney;
        this.insEmptyCells = insEmptyCells;
        this.moreDetail6 = moreDetail6;
        this.insLogoDhmiourgiasBasilikonKelio = insLogoDhmiourgiasBasilikonKelio;
        this.illFarmakoGiaBarroa = illFarmakoGiaBarroa;
        this.illTropowEfarmogiw = illTropowEfarmogiw;
        this.illBarroa = illBarroa;
        this.illdeployFarkakoGiaBalboa = illdeployFarkakoGiaBalboa;
        this.trofodosiaPosotita = trofodosiaPosotita;
        this.trofodosiaFlag = trofodosiaFlag;
        this.trofodosiaDate = trofodosiaDate;
        this.trofodosiaEidos = trofodosiaEidos;
        this.diafragmaFlag = diafragmaFlag;
        this.diafragmaDate = diafragmaDate;
        this.diagragmaTroposDhmiourgia = diagragmaTroposDhmiourgia;
        this.diafragmaDateRemove = diafragmaDateRemove;
        this.giroDate = giroDate;
        this.girotopothetisiFlag = girotopothetisiFlag;
        this.giroAmount = giroAmount;
        this.giroDateRemove = giroDateRemove;
        this.sitiaFlag = sitiaFlag;
        this.sitiaDate = sitiaDate;
        this.sitiaPosotita = sitiaPosotita;
        this.sitiaDateRemove = sitiaDateRemove;
        this.trigosDate = trigosDate;
        this.trigosFito = trigosFito;
        this.trigosPlaisioMeli = trigosPlaisioMeli;
        this.trigosPlaisioMeliKila = trigosPlaisioMeliKila;
        this.trigosApodosiXronias = trigosApodosiXronias;
        this.afanismosDate = afanismosDate;
        this.info = info;
        this.inspectonCode = inspectonCode;
        this.insGonos = insGonos;
        this.insSxino = insSxino;
        this.insDateSxino = insDateSxino;
        this.insTotal = insTotal;
    }

    public String getMoreDetail6() {
        return moreDetail6;
    }

    public void setMoreDetail6(String moreDetail6) {
        this.moreDetail6 = moreDetail6;
    }


    public String getInsGonos() {
        return insGonos;
    }

    public void setInsGonos(String insGonos) {
        this.insGonos = insGonos;
    }

    public String getInsSxino() {
        return insSxino;
    }

    public void setInsSxino(String insSxino) {
        this.insSxino = insSxino;
    }

    public Date getInsDateSxino() {
        return insDateSxino;
    }

    public void setInsDateSxino(Date insDateSxino) {
        this.insDateSxino = insDateSxino;
    }

    public String getInsTotal() {
        return insTotal;
    }

    public void setInsTotal(String insTotal) {
        this.insTotal = insTotal;
    }

    public String getInspectonCode() {
        return inspectonCode;
    }

    public void setInspectonCode(String inspectonCode) {
        this.inspectonCode = inspectonCode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public Date getAfanismosDate() {
        return afanismosDate;
    }

    public void setAfanismosDate(Date afanismosDate) {
        this.afanismosDate = afanismosDate;
    }

    public String getTrigosDate() {
        return trigosDate;
    }

    public void setTrigosDate(String trigosDate) {
        this.trigosDate = trigosDate;
    }

    public String getTrigosFito() {
        return trigosFito;
    }

    public void setTrigosFito(String trigosFito) {
        this.trigosFito = trigosFito;
    }

    public String getTrigosPlaisioMeli() {
        return trigosPlaisioMeli;
    }

    public void setTrigosPlaisioMeli(String trigosPlaisioMeli) {
        this.trigosPlaisioMeli = trigosPlaisioMeli;
    }

    public String getTrigosPlaisioMeliKila() {
        return trigosPlaisioMeliKila;
    }

    public void setTrigosPlaisioMeliKila(String trigosPlaisioMeliKila) {
        this.trigosPlaisioMeliKila = trigosPlaisioMeliKila;
    }

    public String getTrigosApodosiXronias() {
        return trigosApodosiXronias;
    }

    public void setTrigosApodosiXronias(String trigosApodosiXronias) {
        this.trigosApodosiXronias = trigosApodosiXronias;
    }

    public String getBasicNameBeeHive() {
        return basicNameBeeHive;
    }

    public void setBasicNameBeeHive(String basicNameBeeHive) {
        this.basicNameBeeHive = basicNameBeeHive;
    }

    public String getBasicNumberBeeHive() {
        return basicNumberBeeHive;
    }

    public void setBasicNumberBeeHive(String basicNumberBeeHive) {
        this.basicNumberBeeHive = basicNumberBeeHive;
    }

    public String getBasikilaKelliaTroposDhmiourgia() {
        return basikilaKelliaTroposDhmiourgia;
    }

    public void setBasikilaKelliaTroposDhmiourgia(String basikilaKelliaTroposDhmiourgia) {
        this.basikilaKelliaTroposDhmiourgia = basikilaKelliaTroposDhmiourgia;
    }

    public Date getBasicInfoImerominiaDimiourgia() {
        return basicInfoImerominiaDimiourgia;
    }

    public void setBasicInfoImerominiaDimiourgia(Date basicInfoImerominiaDimiourgia) {
        this.basicInfoImerominiaDimiourgia = basicInfoImerominiaDimiourgia;
    }

    public String getMamaOptionsDimiourgia() {
        return mamaOptionsDimiourgia;
    }

    public void setMamaOptionsDimiourgia(String mamaOptionsDimiourgia) {
        this.mamaOptionsDimiourgia = mamaOptionsDimiourgia;
    }

    public String getManaIkanothta() {
        return manaIkanothta;
    }

    public void setManaIkanothta(String manaIkanothta) {
        this.manaIkanothta = manaIkanothta;
    }

    public String getManaGonoimopoihmenh() {
        return manaGonoimopoihmenh;
    }

    public void setManaGonoimopoihmenh(String manaGonoimopoihmenh) {
        this.manaGonoimopoihmenh = manaGonoimopoihmenh;
    }

    public Date getManaHmeromhnia() {
        return manaHmeromhnia;
    }

    public void setManaHmeromhnia(Date manaHmeromhnia) {
        this.manaHmeromhnia = manaHmeromhnia;
    }

    public String getManaKatastash() {
        return manaKatastash;
    }

    public void setManaKatastash(String manaKatastash) {
        this.manaKatastash = manaKatastash;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public String getInsBasilikaKelia() {
        return insBasilikaKelia;
    }

    public void setInsBasilikaKelia(String insBasilikaKelia) {
        this.insBasilikaKelia = insBasilikaKelia;
    }

    public String getInsCellGono() {
        return insCellGono;
    }

    public void setInsCellGono(String insCellGono) {
        this.insCellGono = insCellGono;
    }

    public String getInsCellGiri() {
        return insCellGiri;
    }

    public void setInsCellGiri(String insCellGiri) {
        this.insCellGiri = insCellGiri;
    }

    public String getInsHoney() {
        return insHoney;
    }

    public void setInsHoney(String insHoney) {
        this.insHoney = insHoney;
    }

    public String getInsEmptyCells() {
        return insEmptyCells;
    }

    public void setInsEmptyCells(String insEmptyCells) {
        this.insEmptyCells = insEmptyCells;
    }

    public String getInsLogoDhmiourgiasBasilikonKelio() {
        return insLogoDhmiourgiasBasilikonKelio;
    }

    public void setInsLogoDhmiourgiasBasilikonKelio(String insLogoDhmiourgiasBasilikonKelio) {
        this.insLogoDhmiourgiasBasilikonKelio = insLogoDhmiourgiasBasilikonKelio;
    }

    public String getIllFarmakoGiaBarroa() {
        return illFarmakoGiaBarroa;
    }

    public void setIllFarmakoGiaBarroa(String illFarmakoGiaBarroa) {
        this.illFarmakoGiaBarroa = illFarmakoGiaBarroa;
    }

    public String getIllTropowEfarmogiw() {
        return illTropowEfarmogiw;
    }

    public void setIllTropowEfarmogiw(String illTropowEfarmogiw) {
        this.illTropowEfarmogiw = illTropowEfarmogiw;
    }

    public String getIllBarroa() {
        return illBarroa;
    }

    public void setIllBarroa(String illBarroa) {
        this.illBarroa = illBarroa;
    }

    public Date getIlldeployFarkakoGiaBalboa() {
        return illdeployFarkakoGiaBalboa;
    }

    public void setIlldeployFarkakoGiaBalboa(Date illdeployFarkakoGiaBalboa) {
        this.illdeployFarkakoGiaBalboa = illdeployFarkakoGiaBalboa;
    }

    public String getTrofodosiaPosotita() {
        return trofodosiaPosotita;
    }

    public void setTrofodosiaPosotita(String trofodosiaPosotita) {
        this.trofodosiaPosotita = trofodosiaPosotita;
    }

    public String getTrofodosiaFlag() {
        return trofodosiaFlag;
    }

    public void setTrofodosiaFlag(String trofodosiaFlag) {
        this.trofodosiaFlag = trofodosiaFlag;
    }

    public Date getTrofodosiaDate() {
        return trofodosiaDate;
    }

    public void setTrofodosiaDate(Date trofodosiaDate) {
        this.trofodosiaDate = trofodosiaDate;
    }

    public String getTrofodosiaEidos() {
        return trofodosiaEidos;
    }

    public void setTrofodosiaEidos(String trofodosiaEidos) {
        this.trofodosiaEidos = trofodosiaEidos;
    }

    public String getDiafragmaFlag() {
        return diafragmaFlag;
    }

    public void setDiafragmaFlag(String diafragmaFlag) {
        this.diafragmaFlag = diafragmaFlag;
    }

    public Date getDiafragmaDate() {
        return diafragmaDate;
    }

    public void setDiafragmaDate(Date diafragmaDate) {
        this.diafragmaDate = diafragmaDate;
    }

    public String getDiagragmaTroposDhmiourgia() {
        return diagragmaTroposDhmiourgia;
    }

    public void setDiagragmaTroposDhmiourgia(String diagragmaTroposDhmiourgia) {
        this.diagragmaTroposDhmiourgia = diagragmaTroposDhmiourgia;
    }

    public String getDiafragmaDateRemove() {
        return diafragmaDateRemove;
    }

    public void setDiafragmaDateRemove(String diafragmaDateRemove) {
        this.diafragmaDateRemove = diafragmaDateRemove;
    }

    public Date getGiroDate() {
        return giroDate;
    }

    public void setGiroDate(Date giroDate) {
        this.giroDate = giroDate;
    }

    public String getGirotopothetisiFlag() {
        return girotopothetisiFlag;
    }

    public void setGirotopothetisiFlag(String girotopothetisiFlag) {
        this.girotopothetisiFlag = girotopothetisiFlag;
    }

    public String getGiroAmount() {
        return giroAmount;
    }

    public void setGiroAmount(String giroAmount) {
        this.giroAmount = giroAmount;
    }

    public Date getGiroDateRemove() {
        return giroDateRemove;
    }

    public void setGiroDateRemove(Date giroDateRemove) {
        this.giroDateRemove = giroDateRemove;
    }

    public String getSitiaFlag() {
        return sitiaFlag;
    }

    public void setSitiaFlag(String sitiaFlag) {
        this.sitiaFlag = sitiaFlag;
    }

    public Date getSitiaDate() {
        return sitiaDate;
    }

    public void setSitiaDate(Date sitiaDate) {
        this.sitiaDate = sitiaDate;
    }

    public String getSitiaPosotita() {
        return sitiaPosotita;
    }

    public void setSitiaPosotita(String sitiaPosotita) {
        this.sitiaPosotita = sitiaPosotita;
    }

    public Date getSitiaDateRemove() {
        return sitiaDateRemove;
    }

    public void setSitiaDateRemove(Date sitiaDateRemove) {
        this.sitiaDateRemove = sitiaDateRemove;
    }
}