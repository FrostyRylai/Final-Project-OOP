//ASSET FUNCTIONS
public abstract class Material {
    protected int materialId;
    protected String titleOrName;
    protected String authorOrPublisher;
    protected int yearPublished;
    protected String publisher;
    protected int copies; // available copies
    
    public Material (int materialId, String titleOrName, String authorOrPublisher, int yearPublished, String publisher, int copies) {
        this.materialId = materialId;
        this.titleOrName = titleOrName;
        this.authorOrPublisher = authorOrPublisher;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.copies = copies;
    }
               
    public int getMaterialId() {
        return materialId;
    }

    public String getTitleOrName() {
        return titleOrName;
    }

    public String getAuthorOrPublisher() {
        return authorOrPublisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopies() {
        return copies;
    } 

    @Override
    public String toString() {
        return materialId + " | " + titleOrName + " | " + authorOrPublisher + " | " + yearPublished + " | " + publisher + " | Copies: " + copies; 
    }  
}

