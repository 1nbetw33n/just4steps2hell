/*
 *
 * 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *     - entities that support:
 *         > queer hostility
 *         > any kind of religion
 *         > authoritarianism
 *         > sexism
 *         > racism
 *         > ableism
 *     - (most) boomer
 *     - conservatives
 *     - nazis
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

package main.eidp.ss22.bib;

/*
 * Created by 0x1nbetw33n on 06/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import main.eidp.ss22.misc.Person;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal", "unused"})
public class User extends Person {

    private static int objectCounter = 1;
    private final int id;
    private final Media[] lentObjects = new Media[10];

    public User(String name, int birthyear) {
        super(name, birthyear);
        id = objectCounter++;
    }

    public Media[] lentList(){return lentObjects;}

    public void lendMedia(Media media) throws Exception {
        if (media.getOwner() != null) {throw new IllegalStateException("Media cant be lent because somebody else already lent it");}
        for (int i = 0; i < lentObjects.length; i++) {
            if (lentObjects[i] == null) {
                lentObjects[i] = media;
                media.setOwner(this);
                break;
            }
        }
        throw new Exception("You already lent 10 items - return 1 item, before you can lend one more");
    }

    private boolean containsMedia(Media media){
        for (Media m : lentObjects){if (m.equals(media)){return true;}}
        return false;
    }

    public void returnMedia(Media media){
        if (!containsMedia(media)){throw new IllegalStateException("Media that ain't lent cant be returned");}
        for (int i = 0; i < lentObjects.length; i++){
            if (lentObjects[i].equals(media)){
                media.setOwner(null);
                lentObjects[i] = null;
                break;
            }
        }
    }

    public void returnAllMedia(Media media){
        for (int i = 0; i < lentObjects.length; i++){
            if (lentObjects[i] != null){
                media.setOwner(null);
                lentObjects[i] = null;
            }
        }
    }

    public void printLentObjects(){for(Media m : lentObjects){System.out.println(m);}}

}