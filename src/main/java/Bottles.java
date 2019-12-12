import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
                out.print(bootles(beers) + " of beer on the wall,");
                out.println(bootles(beers) + " of beer,");
                out.print(takeBeerDown(beers));
                out.println(bootles(beersLeft(beers)) + " of beer on the wall.\r\n");
        }
    }

    private static String bootles(int beers) {
        return beers + pluralInBottle(beers);
    }

    public static int beersLeft(int beers) {
        return (beers != 0) ? beers - 1 : 99;
    }

    public static String pluralInBottle(int beers) {
        return (beers != 1) ? " bottles" : " bottle";
    }

    public static String takeBeerDown(int beers) {
        return (beers != 0) ? "Take one down, pass it around," : "Go to the store, buy some more,";
    }
}