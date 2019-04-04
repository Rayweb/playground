package snipets.codewar.likes;


public class Omar implements WhoLikesIt {
    private static final String SINGULAR_LIKE="like this";
    private static final String PLURAL_LIKE="likes this";
    private static final String NO_LIKES="no one "+ PLURAL_LIKE;
    private static final String AND_SEPARATOR=" and ";
    private static final String COMMA_SEPARATOR=", ";
    private abstract class LikeGenerator{
        public StringBuilder get(String[] names){
            StringBuilder likes = new StringBuilder();
            for(int i = 0; i < upTo(names);i++){
                separator(i,likes);
                likes.append(names[i]);
            }
            lastSeparator(likes,names);
            likes.append(names.length>1 ? SINGULAR_LIKE:PLURAL_LIKE);
            return likes;
        }

        protected abstract int upTo(String[] names);

        private  void lastSeparator(StringBuilder likes,final String[] names){
            if (names.length <=3){
                likes.append(" ");
            }else{
                likes.append(AND_SEPARATOR);
                likes.append(names.length-2);
                likes.append(" others ");
            }
        }
        protected abstract void separator(int index, StringBuilder likes);

    }
    private class ThreeOrMoreLikeGenerator extends LikeGenerator{
        private static final int FIRST_TWO_NAMES=2;
        @Override
        protected int upTo(String[] names) {
            return names.length == 3 ? names.length:FIRST_TWO_NAMES;
        }

        @Override
        protected void separator(int index, StringBuilder likes) {
            if (index == 1  ){
                likes.append(COMMA_SEPARATOR);
            }else if (index>1){
                likes.append(AND_SEPARATOR);
            }
        }
    }
    private class TwoOrLessLikeGenerator extends LikeGenerator{
        @Override
        protected int upTo(String[] names) {
            return names.length;
        }

        @Override
        protected void separator(int index, StringBuilder likes) {
            if (index > 0 ){
                likes.append(AND_SEPARATOR);
            }
        }
    }
    @Override
    public String likes(String... names) {
        StringBuilder likes = new StringBuilder(NO_LIKES);
        if(names.length != 0){
            likes = new StringBuilder("");
            if(names.length <3)
                likes = new TwoOrLessLikeGenerator().get(names);
            else
                likes = new ThreeOrMoreLikeGenerator().get(names);
        }
        return likes.toString();

    }
}
