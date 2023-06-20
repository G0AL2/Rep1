package fm.castbox.mediation.model;

import ed.c;

/* loaded from: classes3.dex */
public class DisplayResult {
    public static final String CATEGORY_BIDDING = "BIDDING";
    public static final String CATEGORY_WATERFALL = "WATERFALL";
    private String category;
    private boolean displayed;
    @c("network_name")
    private String networkName;
    @c("tag_id")
    private String tagId;

    public DisplayResult(String str, boolean z10, String str2, String str3) {
        this.category = str;
        this.displayed = z10;
        this.networkName = str2;
        this.tagId = str3;
    }

    public String toString() {
        return "DisplayResult{category='" + this.category + "', displayed=" + this.displayed + ", networkName='" + this.networkName + "', tagId='" + this.tagId + "'}";
    }
}
