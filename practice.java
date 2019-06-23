import java.util.ArrayList;

class practice {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();

        listOfNums.add(1);
        listOfNums.add(3);
        listOfNums.add(5);

        // CLASSIC FOR LOOP WAY
        for (int i = 0; i < listOfNums.size(); i++) {
            System.out.println(listOfNums.get(i));
        }

        // THE WHILE LOOP WAY
        int i = 0;
        while (i < listOfNums.size()) {
            System.out.println(listOfNums.get(i));
            i++;
        }

        // THE ADVANCED WAY
        for (Integer temp : listOfNums) {
            System.out.println(temp);
        }

        // HIGHER ORDER FUNCTIONS WAY
        listOfNums.forEach((temp) -> {
            System.out.println(temp);
        });

    }
}