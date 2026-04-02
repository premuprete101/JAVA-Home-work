
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}


class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image...");
    }

    public void reset_filter() {
        System.out.println("Image filter reset to original.");
    }
}


class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to dataset...");
    }

    public void reset_filter() {
        System.out.println("Data filters cleared.");
    }
}

public class Main {
    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        
        data.apply_filter("Low-pass");
        data.reset_filter();
    }
}