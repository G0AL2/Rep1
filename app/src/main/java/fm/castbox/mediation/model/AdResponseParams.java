package fm.castbox.mediation.model;

import fm.castbox.mediation.model.ad.Ad;

/* loaded from: classes3.dex */
public class AdResponseParams {
    private static final String TAG = "AdResponseParams";

    /* renamed from: ad  reason: collision with root package name */
    private Ad f30371ad;
    private int code;
    private String description;
    private int status;

    public Ad getAd() {
        return this.f30371ad;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "AdResponseParams{status=" + this.status + ", code=" + this.code + ", description='" + this.description + "', ad=" + this.f30371ad + '}';
    }
}
