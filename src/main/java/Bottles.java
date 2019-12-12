import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            if (beers == 0) {
                out.print(beers + pluralBottles(beers) + " of beer on the wall,");
                out.println(beers + pluralBottles(beers) + " of beer,");
                out.print(takeBeerDown(beers));
                out.println("99 bottles of beer on the wall.\r\n");
            } else if (beers == 1) {
                out.print(beers + pluralBottles(beers) + " of beer on the wall,");
                out.println(beers + pluralBottles(beers) + " of beer,");
                out.print(takeBeerDown(beers));
                out.println(beers - 1 + pluralBottles(beers+1) + " of beer on the wall.\r\n");
            } else if (beers == 2) {
                out.print(beers + pluralBottles(beers) + " of beer on the wall,");
                out.println(beers + pluralBottles(beers) + " of beer,");
                out.print(takeBeerDown(beers));
                out.println(beers - 1 + pluralBottles(beers-1) + " of beer on the wall.\r\n");
            } else {
                out.print(beers + pluralBottles(beers) + " of beer on the wall,");
                out.println(beers + pluralBottles(beers) + " of beer,");
                out.print(takeBeerDown(beers));
                out.println(beers - 1 + pluralBottles(beers) + " of beer on the wall.\r\n");
            }
        }
    }

    public static String pluralBottles(int beers) {
        return (beers != 1) ? " bottles" : " bottle";
    }

    public static String takeBeerDown(int beers) {
        return (beers != 0) ? "Take one down, pass it around," : "Go to the store, buy some more,";
    }
}