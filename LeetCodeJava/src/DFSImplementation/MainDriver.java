package DFSImplementation;

public class MainDriver {
    public static void main(String[] arg) {
        Graph mAirportGraph = new Graph();

        Airport sjc = new Airport("SJC");
        Airport sfo = new Airport("SFO");
        Airport san = new Airport("SAN");
//        Airport





        mAirportGraph.addNewPlace(sjc);
        mAirportGraph.connectPlaces(sjc, sfo);
        mAirportGraph.connectPlaces(sfo, san);
        mAirportGraph.connectPlaces(sjc, san);
        mAirportGraph.connectPlaces(sjc, san);
        mAirportGraph.connectPlaces(sjc, san);
        mAirportGraph.connectPlaces(sjc, san);
        mAirportGraph.connectPlaces(sjc, san);
        mAirportGraph.connectPlaces(sjc, san);




    }
}
