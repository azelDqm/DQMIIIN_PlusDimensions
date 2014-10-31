package DQMIIDim;

import java.util.Hashtable;

public class dataTable {

    public Hashtable BlockIdDimIdTb;

    public dataTable()
    {
    	BlockIdDimIdTb = new Hashtable();
    }

    public void addBlockIdDimIdTb(int par1, int par2)
    {
    	BlockIdDimIdTb.put(par1, par2);
    }
}
