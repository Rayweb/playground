package snipets.codewar.likes;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Omar implements WhoLikesIt {
    private static String NO_LIKES="no one likes this";
    @Override
    public String likes(String... names) {
           String  likes =
               Stream.of(names).filter(Objects::nonNull).map(name->name+",").collect(Collectors.joining());
        System.out.println("result is ");
        System.out.println(likes);
        return "".equals(likes) ? NO_LIKES:likes;
    }
}
