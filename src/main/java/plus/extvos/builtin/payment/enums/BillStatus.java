package plus.extvos.builtin.payment.enums;

/**
 * @author shenmc
 */

public enum BillStatus {

    /**
     *
     */
    REFUNDED((short) -3, "Refunded"),
    CANCELLED((short) -2, "Cancelled"),
    FAILED((short) -1, "Failed"),
    NONE((short) 0, "None"),
    REQUESTED((short) 1, "Requested"),
    SCANNED((short) 2, "Scanned"),
    PAYING((short) 3, "Paying"),
    PAYED((short) 4, "Payed");

    /**
     * Status value
     */
    private final short value;

    /**
     * Status description
     */
    private final String desc;

    /**
     * @param v
     * @param d
     */
    BillStatus(short v, String d) {
        value = v;
        desc = d;
    }

    /**
     * @return value of status
     */
    public short value() {
        return this.value;
    }

    /**
     * @return description of status
     */
    public String desc() {
        return this.desc;
    }
}
