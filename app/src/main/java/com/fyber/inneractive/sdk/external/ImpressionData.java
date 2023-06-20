package com.fyber.inneractive.sdk.external;

/* loaded from: classes.dex */
public class ImpressionData {

    /* renamed from: a  reason: collision with root package name */
    public Pricing f17125a = new Pricing();

    /* renamed from: b  reason: collision with root package name */
    public Video f17126b;

    /* renamed from: c  reason: collision with root package name */
    public String f17127c;

    /* renamed from: d  reason: collision with root package name */
    public Long f17128d;

    /* renamed from: e  reason: collision with root package name */
    public String f17129e;

    /* renamed from: f  reason: collision with root package name */
    public String f17130f;

    /* renamed from: g  reason: collision with root package name */
    public String f17131g;

    /* renamed from: h  reason: collision with root package name */
    public String f17132h;

    /* renamed from: i  reason: collision with root package name */
    public String f17133i;

    /* loaded from: classes.dex */
    public static class Pricing {

        /* renamed from: a  reason: collision with root package name */
        public double f17134a;

        /* renamed from: b  reason: collision with root package name */
        public String f17135b;

        public String getCurrency() {
            return this.f17135b;
        }

        public double getValue() {
            return this.f17134a;
        }

        public void setValue(double d10) {
            this.f17134a = d10;
        }

        public String toString() {
            return "Pricing{value=" + this.f17134a + ", currency='" + this.f17135b + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static class Video {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17136a;

        /* renamed from: b  reason: collision with root package name */
        public long f17137b;

        public Video(boolean z10, long j10) {
            this.f17136a = z10;
            this.f17137b = j10;
        }

        public long getDuration() {
            return this.f17137b;
        }

        public boolean isSkippable() {
            return this.f17136a;
        }

        public String toString() {
            return "Video{skippable=" + this.f17136a + ", duration=" + this.f17137b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f17133i;
    }

    public String getCampaignId() {
        return this.f17132h;
    }

    public String getCountry() {
        return this.f17129e;
    }

    public String getCreativeId() {
        return this.f17131g;
    }

    public Long getDemandId() {
        return this.f17128d;
    }

    public String getDemandSource() {
        return this.f17127c;
    }

    public String getImpressionId() {
        return this.f17130f;
    }

    public Pricing getPricing() {
        return this.f17125a;
    }

    public Video getVideo() {
        return this.f17126b;
    }

    public void setAdvertiserDomain(String str) {
        this.f17133i = str;
    }

    public void setCampaignId(String str) {
        this.f17132h = str;
    }

    public void setCountry(String str) {
        this.f17129e = str;
    }

    public void setCpmValue(String str) {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f17125a.f17134a = d10;
    }

    public void setCreativeId(String str) {
        this.f17131g = str;
    }

    public void setCurrency(String str) {
        this.f17125a.f17135b = str;
    }

    public void setDemandId(Long l10) {
        this.f17128d = l10;
    }

    public void setDemandSource(String str) {
        this.f17127c = str;
    }

    public void setDuration(long j10) {
        this.f17126b.f17137b = j10;
    }

    public void setImpressionId(String str) {
        this.f17130f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f17125a = pricing;
    }

    public void setVideo(Video video) {
        this.f17126b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f17125a + ", video=" + this.f17126b + ", demandSource='" + this.f17127c + "', country='" + this.f17129e + "', impressionId='" + this.f17130f + "', creativeId='" + this.f17131g + "', campaignId='" + this.f17132h + "', advertiserDomain='" + this.f17133i + "'}";
    }
}
