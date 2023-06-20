package fm.castbox.mediation.model;

/* loaded from: classes3.dex */
public class AdRequestAppInfo {
    private String bundle;
    private String ver;

    public String getBundle() {
        return this.bundle;
    }

    public String getVer() {
        return this.ver;
    }

    public void setBundle(String str) {
        this.bundle = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public String toString() {
        return "AdRequestAppInfo{ver='" + this.ver + "', bundle='" + this.bundle + "'}";
    }
}
