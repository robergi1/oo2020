public class ESTCode implements Properties {
    private String gender;
    private String yearNumber = null;
    private String millenium = null;
    private String yearNum;
    private Character human;
    private String birthDay;
    private String birthMonth;
    
    void getGender(String estCode) {
        
        Character human1 = estCode.charAt(0);
        gender = null;
        if(human1.equals('1') || human1.equals('3') || human1.equals('5') || human1.equals('7')){
            gender = "male";
            System.out.println("Gender is " + gender );
        } else {
            gender = "woman";
            System.out.println("Gender is " + gender );
        }

    }

    void getYear(String estCode) {
        
        human = estCode.charAt(0);
        yearNum = estCode.substring(1, 3);

        if(human.equals('1') || human.equals('2')){
            millenium = "18";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(human.equals('3') || human.equals('4')) {
            millenium = "19";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(human.equals('5') || human.equals('6')) {
            millenium = "20";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(human.equals('7') || human.equals('8')) {
            millenium = "21";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else {
            System.out.println("Insert your Personalcode");
        }

    }

    void getBirthday(String estCode) {

        birthDay = estCode.substring(5, 7);
        birthMonth = estCode.substring(3, 5);
        System.out.println("Birthday is at " + birthDay + "." + birthMonth);

    }

    @Override
    public String getGender() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBirthday() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getYear() {
        // TODO Auto-generated method stub
        return 0;
    }
  
}