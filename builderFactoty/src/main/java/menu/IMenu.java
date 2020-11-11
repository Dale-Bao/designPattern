package menu;

import matter.Matter;

/**
 * @author xueneng on 2020/11/11.
 *         Description:
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter);
    IMenu appendCoat(Matter matter);
    IMenu appendFloor(Matter matter);
    IMenu appendTile(Matter matter);
    String getDetail();
}
