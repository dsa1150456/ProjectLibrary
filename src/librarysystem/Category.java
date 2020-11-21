package librarysystem;

public enum Category {
    SCIFI , HORROR , FANTASY , MYSTERY , THRILLER , ROMANCE , WESTERN , DYSTOPIAN , CONTEMPORARY ,
    ADVENTURE ,  PARANORMAL , HISTORICAL_FICTION , SCIENCE_FICTION , MEMOIR , COOKING , ART , PERSONAL , DEVELOPMENT , MOTIVATION 
    , HEALTH , HISTORY , TRAVEL , HOW_TO_GUIDE , FAMILLIES_RELATIONSHIPS , HUMOR , Children;
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}