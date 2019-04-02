package snipets.codewar.likes;


public class Omar implements WhoLikesIt {
    private static final String SINGULAR_LIKE="like this";
    private static final String PLURAL_LIKE="likes this";
    private static final String NO_LIKES="no one "+ PLURAL_LIKE;
    private static final String AND_SEPARATOR=" and ";
    private static final String COMMA_SEPARATOR=", ";
    @Override
    public String likes(String... names) {
        StringBuilder likes = new StringBuilder(NO_LIKES);
        if(names.length != 0){
            likes = new StringBuilder("");
            if(names.length <3)
                likes = getForTwo(names);
            else if(names.length == 3)
                likes = getForThree(names);
            else
                likes = getForN(names);
        }
        return likes.toString();

    }
    private StringBuilder getForN(String[] names) {
        StringBuilder likes = new StringBuilder();
        for(int i = 0; i < 2;i++){
            if (i == 1  ){
                likes.append(COMMA_SEPARATOR);
            }else if (i>1){
                likes.append(AND_SEPARATOR);
            }
            likes.append(names[i]);
        }
        likes.append(AND_SEPARATOR);
        likes.append(names.length-2);
        likes.append(" others ");
        likes.append(names.length>1 ? SINGULAR_LIKE:PLURAL_LIKE);
        return likes;
    }

    private StringBuilder getForThree(String[] names) {
        StringBuilder likes = new StringBuilder();
        for(int i = 0; i < names.length;i++){
            if (i == 1  ){
                likes.append(COMMA_SEPARATOR);
            }else if (i>1){
                likes.append(AND_SEPARATOR);
            }
            likes.append(names[i]);
        }
        likes.append(" ");
        likes.append(names.length>1 ? SINGULAR_LIKE:PLURAL_LIKE);
        return likes;
    }

    private StringBuilder getForTwo(String[] names) {
        StringBuilder likes = new StringBuilder();
        for(int i = 0; i < names.length;i++){
            if (i > 0 ){
                likes.append(AND_SEPARATOR);
            }
            likes.append(names[i]);
        }
        likes.append(" ");
        likes.append(names.length>1 ? SINGULAR_LIKE:PLURAL_LIKE);
        return likes;
    }
}
