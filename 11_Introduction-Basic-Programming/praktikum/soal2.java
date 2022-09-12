public class soal2 {
    public static void main(String[] args) {
        int studentscore = 80;
        String nilai;

        if(studentscore >= 80){
            nilai ="A";
        }
        else if(studentscore >= 79){
            nilai = "B+";
        }
        else if(studentscore >= 64){
            nilai ="B";
        }
        else if(studentscore >= 49){
            nilai ="C";
        }
        else {
            nilai ="D";
        }

        System.out.println("Nilai " + nilai);

    }
}
