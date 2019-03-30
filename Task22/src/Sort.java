import java.util.Scanner;

public class Sort {
    private int[] tab;
    private Scanner scanner;

    public Sort(int number) {
        this.tab = new int [number];
    }
    public int[] addingNumbers(){
        System.out.println("Podaj inty: ");
        this.scanner = new Scanner(System.in);
        for(int i = 0; i < this.tab.length; i++){
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
    public void printArray(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }

    public int[] getTab() {
        return tab;
    }

    public int[] sortArray(){
        int newTab[] = new int[this.tab.length];
        boolean flag = true;
        int temp;
        for(int i = 0; i < this.tab.length; i++) {
            newTab[i] = this.tab[i];
        }

        while(flag){
            flag = false;
            for(int i = 0; i<newTab.length-1; i++){
                if(newTab[i] < newTab [i+1]){
                    temp = newTab[i];
                    newTab[i] = newTab[i+1];
                    newTab[i+1] = temp;
                    flag = true;
                }
            }
        }

        return newTab;
    }
}
