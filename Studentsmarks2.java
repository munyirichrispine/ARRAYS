class StudentMarks2 {
    public static void main(String[] args) {

        int[][] marks = {
            {75, 80, 90},
            {65, 70, 85},
            {88, 92, 81}
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int j = 0; j < marks[2].length; j++) {
            sum += marks[2][j];
        }

        double average = (double) sum / marks[2].length;
        System.out.println("AVERAGE MARK FOR THE THIRD STUDENT: " + average);
    }
}
