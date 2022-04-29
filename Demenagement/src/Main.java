public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        int firstLocalContent = 34;
        int truckContent = 0;
        int truckMaxCapacity = 9;
        int newLocalContent = 0;

        while (firstLocalContent > 0) {
            if (firstLocalContent >= truckMaxCapacity) {
                firstLocalContent -=truckMaxCapacity;
                truckContent +=truckMaxCapacity;
                System.out.println("Un voyage de " + truckContent + " cartons");
                newLocalContent +=truckContent;
                truckContent -=truckContent;
            } else {
                truckContent +=firstLocalContent;
                firstLocalContent -=firstLocalContent;
                System.out.println("Un voyage de " + truckContent + " cartons");
                newLocalContent +=truckContent;
                truckContent -=truckContent;
            }
        }
        System.out.println("Fin du déménagement. Le premier local contient " + firstLocalContent + " cartons. Le camion contient " + truckContent + " cartons. Le nouveau local contient " + newLocalContent + " cartons");

    }
}