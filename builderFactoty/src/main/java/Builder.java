import com.sun.org.apache.bcel.internal.generic.NEW;
import matter.ceiling.LevelOneCeiling;
import matter.ceiling.LevelTwoCeiling;
import matter.coat.DuluxCoat;
import matter.coat.LiBangCoat;
import matter.floor.ShengXiangFloor;
import matter.tile.DongPengTile;
import matter.tile.MarcoPoloTile;
import menu.IMenu;
import menu.impl.DecorationPackageMenu;

/**
 * @author xueneng on 2020/11/11.
 *         Description:
 */
@lombok.Builder
public class Builder {
    public static IMenu levelOne(Double area){
        return new DecorationPackageMenu(area,"豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public static IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area,"轻奢田园")
                    .appendCeiling(new LevelTwoCeiling())
                    .appendCoat(new LiBangCoat())
                    .appendCeiling(new MarcoPoloTile());
    }

    public static IMenu levelThree(Double area){
        return new DecorationPackageMenu(area,"现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendCeiling(new DongPengTile());
    }
}
