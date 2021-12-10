// Justice Smith
// Test to see whether random values from a collection can reliably approximate
// the true mean of that collection.
// Will incorporate graphical display to see the plotted rich means and their
// line of best fit.

import java.util.*;

// Track deviation from mean on repeated calculations of mean of
// subset of values in a collection. This gives the "bandedness"
// of the collection, or its "elasticity".
public class MeanFinder
{
    private static Integer [] generateRandomList(int n)
    {
        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++)
        {
            int rand = (int) (Math.random() * 100 + 1);
            arr[i] = Integer.valueOf(rand);
        }

        return arr;
    }

    public static void main(String [] args)
    {
        int len = (args.length == 0) ? 50 : Integer.parseInt(args[0]);
        Integer [] randList = generateRandomList(len);

        RichList texList = new RichList(randList);

        System.out.format("TRUE MEAN: %s\n\n", (texList.getMean()).toString());
        System.out.format("Approximations:\n");
        System.out.format("==============================\n");

        int numCycles;
        Double opRes = texList.pick5Mean(numCycles = 100);
        if (opRes == null)
            System.out.println("list too small");
    }
}

class RichList
{
    private List<Integer> coll;
    private Double mean;
    private Integer sum;

    RichList()
    {
        this(new ArrayList<Integer>());
    }

    RichList(Integer [] list)
    {
        // copy
        this(new ArrayList<>(Arrays.asList(list)));
    }

    RichList(List<Integer> list)
    {
        coll = list;
        mean = Double.valueOf(0);
        sum = Double.valueOf(0);
        if (list.size() != 0)
        {
            for (Integer val : list)
                mean += Double.valueOf(val);
            mean /= list.size();
        }
    }

    public Double getMean()
    {
        return this.mean;
    }

    public Double pick5Mean(int iter)
    {
        setSumTo(0);
        Double richMean = Double.valueOf(0);

        // 5 or fewer elements isn't worth computing
        if (this.coll.size() <= 5) return null;

        for (int i = 0; i < iter; i++)
        {
            System.out.format("Iter#%d: ", i);
            for (int j = 0; j < 5; j++)
            {
                // Compute
                int randIdx = (int) (Math.random() * this.coll.size());
                Integer toAdd = this.coll.get(randIdx); 
                sum += toAdd;
             
                System.out.format("%s ", toAdd.toString());
            }

            richMean = Double.valueOf(sum) / Double.valueOf(((i+1) * 5));
            System.out.println();
            System.out.format("Rich Mean: %s\n", richMean.toString());
            System.out.format("Deviation from true mean: %s\n\n",
                Double.toString(richMean - this.mean));
        }

        resetSum();

        return richMean;
    }

    private void resetSum()
    {
        this.sum = Integer.valueOf(0);
    }

    private void setSumTo(int setVal)
    {
        this.sum = Integer.valueOf(setVal);
    }
}

