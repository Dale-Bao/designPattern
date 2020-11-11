package matter.tile;

import matter.Matter;

import java.math.BigDecimal;

/**
 * @author xueneng on 2020/11/11.
 *         Description:
 */
public class MarcoPoloTile implements Matter {
    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "马可波罗(Marco Polo)";
    }

    public String model() {
        return "缺省";
    }

    public BigDecimal price() {
        return new BigDecimal(140);
    }

    public String desc() {
        return "马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
}
