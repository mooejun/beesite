package me.daydayup.beesite.modules.blog.utils.backup;

/**
 * @author mooejun
 * @since 2019/4/28
 */
public class FK {
    private String column;
    private Table referenceTable;
    private String referencePK;

    public Table getReferenceTable() {
        return referenceTable;
    }

    public FK(String column, Table referenceTable, String referencePK) {
        this.column = column;
        this.referenceTable = referenceTable;
        this.referencePK = referencePK;
    }

    @Override
    public String toString() {
        return "FK [column=" + column + ", referenceTable=" + referenceTable
                + ", referencePK=" + referencePK + "]";
    }


}
