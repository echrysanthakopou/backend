package gr.pension.app.datatypes;

public class InspectionSubmit {

      private String BasicNumberBeeHive;
      private String BasicNameBeeHive;
      private String BasicInfoImerominiaDimiourgia;
      private String BasikilaKelliaTroposDhmiourgia;



    public String getBasicNumberBeeHive() {
        return BasicNumberBeeHive;
    }

    public void setBasicNumberBeeHive(String basicNumberBeeHive) {
        BasicNumberBeeHive = basicNumberBeeHive;
    }

    public String getBasicNameBeeHive() {
        return BasicNameBeeHive;
    }

    public void setBasicNameBeeHive(String basicNameBeeHive) {
        BasicNameBeeHive = basicNameBeeHive;
    }

    public String getBasicInfoImerominiaDimiourgia() {
        return BasicInfoImerominiaDimiourgia;
    }

    public void setBasicInfoImerominiaDimiourgia(String basicInfoImerominiaDimiourgia) {
        BasicInfoImerominiaDimiourgia = basicInfoImerominiaDimiourgia;
    }

    public String getBasikilaKelliaTroposDhmiourgia() {
        return BasikilaKelliaTroposDhmiourgia;
    }

    public void setBasikilaKelliaTroposDhmiourgia(String basikilaKelliaTroposDhmiourgia) {
        BasikilaKelliaTroposDhmiourgia = basikilaKelliaTroposDhmiourgia;
    }

    @Override
    public String toString() {
        return "InspectionSubmit{" +
                "BasicNumberBeeHive='" + BasicNumberBeeHive + '\'' +
                ", BasicNameBeeHive='" + BasicNameBeeHive + '\'' +
                ", BasicInfoImerominiaDimiourgia='" + BasicInfoImerominiaDimiourgia + '\'' +
                ", BasikilaKelliaTroposDhmiourgia='" + BasikilaKelliaTroposDhmiourgia + '\'' +
                '}';
    }
}
