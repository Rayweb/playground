package snipets.codewar.perfectsquare;

public class Omar extends NextPerfectSquare {
    @Override
    long findNextSquare(long sq) {
        long nextSquare = -1;
        if(isPerfectSquare(sq)){
          nextSquare = getNextPerfectSquare(sq);

        }
        return nextSquare;
    }

    private long getNextPerfectSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        long nextRoot = root+1;
        return nextRoot*nextRoot;
    }

    private boolean isPerfectSquare(long sq) {
        return  Math.sqrt(sq) % 1 == 0;
    }
}
