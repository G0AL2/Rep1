package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.sdk.openadsdk.core.m;
import i3.b;

/* loaded from: classes.dex */
public final class TTAdConfig {

    /* renamed from: a  reason: collision with root package name */
    private String f10577a;

    /* renamed from: b  reason: collision with root package name */
    private String f10578b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10579c;

    /* renamed from: d  reason: collision with root package name */
    private String f10580d;

    /* renamed from: e  reason: collision with root package name */
    private String f10581e;

    /* renamed from: f  reason: collision with root package name */
    private int f10582f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10583g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10584h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10585i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10586j;

    /* renamed from: k  reason: collision with root package name */
    private String[] f10587k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10588l;

    /* renamed from: m  reason: collision with root package name */
    private int f10589m;

    /* renamed from: n  reason: collision with root package name */
    private int f10590n;

    /* renamed from: o  reason: collision with root package name */
    private int f10591o;

    /* renamed from: p  reason: collision with root package name */
    private String f10592p;

    /* renamed from: q  reason: collision with root package name */
    private int f10593q;

    /* renamed from: r  reason: collision with root package name */
    private int f10594r;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f10595a;

        /* renamed from: b  reason: collision with root package name */
        private String f10596b;

        /* renamed from: d  reason: collision with root package name */
        private String f10598d;

        /* renamed from: e  reason: collision with root package name */
        private String f10599e;

        /* renamed from: i  reason: collision with root package name */
        private boolean f10603i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f10604j;

        /* renamed from: k  reason: collision with root package name */
        private String[] f10605k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f10606l;

        /* renamed from: m  reason: collision with root package name */
        private int f10607m;

        /* renamed from: n  reason: collision with root package name */
        private int f10608n;

        /* renamed from: o  reason: collision with root package name */
        private int f10609o;

        /* renamed from: p  reason: collision with root package name */
        private int f10610p;

        /* renamed from: q  reason: collision with root package name */
        private String f10611q;

        /* renamed from: r  reason: collision with root package name */
        private int f10612r;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10597c = false;

        /* renamed from: f  reason: collision with root package name */
        private int f10600f = 0;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10601g = true;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10602h = false;

        public Builder() {
            this.f10603i = Build.VERSION.SDK_INT >= 14;
            this.f10604j = false;
            this.f10606l = false;
            this.f10607m = -1;
            this.f10608n = -1;
            this.f10609o = -1;
        }

        @Deprecated
        public Builder allowShowNotify(boolean z10) {
            this.f10601g = z10;
            return this;
        }

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z10) {
            return this;
        }

        public Builder appIcon(int i10) {
            this.f10612r = i10;
            return this;
        }

        public Builder appId(String str) {
            this.f10595a = str;
            return this;
        }

        @Deprecated
        public Builder appName(String str) {
            this.f10596b = str;
            return this;
        }

        public Builder asyncInit(boolean z10) {
            this.f10606l = z10;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.f10595a);
            tTAdConfig.setCoppa(this.f10607m);
            tTAdConfig.setAppName(this.f10596b);
            tTAdConfig.setAppIcon(this.f10612r);
            tTAdConfig.setPaid(this.f10597c);
            tTAdConfig.setKeywords(this.f10598d);
            tTAdConfig.setData(this.f10599e);
            tTAdConfig.setTitleBarTheme(this.f10600f);
            tTAdConfig.setAllowShowNotify(this.f10601g);
            tTAdConfig.setDebug(this.f10602h);
            tTAdConfig.setUseTextureView(this.f10603i);
            tTAdConfig.setSupportMultiProcess(this.f10604j);
            tTAdConfig.setNeedClearTaskReset(this.f10605k);
            tTAdConfig.setAsyncInit(this.f10606l);
            tTAdConfig.setGDPR(this.f10608n);
            tTAdConfig.setCcpa(this.f10609o);
            tTAdConfig.setDebugLog(this.f10610p);
            tTAdConfig.setPackageName(this.f10611q);
            return tTAdConfig;
        }

        public Builder coppa(int i10) {
            this.f10607m = i10;
            return this;
        }

        public Builder data(String str) {
            this.f10599e = str;
            return this;
        }

        public Builder debug(boolean z10) {
            this.f10602h = z10;
            return this;
        }

        public Builder debugLog(int i10) {
            this.f10610p = i10;
            return this;
        }

        @Deprecated
        public Builder keywords(String str) {
            this.f10598d = str;
            return this;
        }

        @Deprecated
        public Builder needClearTaskReset(String... strArr) {
            this.f10605k = strArr;
            return this;
        }

        @Deprecated
        public Builder paid(boolean z10) {
            this.f10597c = z10;
            return this;
        }

        public Builder setCCPA(int i10) {
            this.f10609o = i10;
            return this;
        }

        public Builder setGDPR(int i10) {
            this.f10608n = i10;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f10611q = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.f10604j = z10;
            return this;
        }

        @Deprecated
        public Builder titleBarTheme(int i10) {
            this.f10600f = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            this.f10603i = z10;
            return this;
        }
    }

    private String a(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public int getAppIconId() {
        return this.f10594r;
    }

    public String getAppId() {
        return this.f10577a;
    }

    public String getAppName() {
        String str = this.f10578b;
        if (str == null || str.isEmpty()) {
            this.f10578b = a(m.a());
        }
        return this.f10578b;
    }

    public int getCcpa() {
        return this.f10591o;
    }

    public int getCoppa() {
        return this.f10589m;
    }

    public String getData() {
        return this.f10581e;
    }

    public int getDebugLog() {
        return this.f10593q;
    }

    public int getGDPR() {
        return this.f10590n;
    }

    public String getKeywords() {
        return this.f10580d;
    }

    public String[] getNeedClearTaskReset() {
        return this.f10587k;
    }

    public String getPackageName() {
        return this.f10592p;
    }

    public int getTitleBarTheme() {
        return this.f10582f;
    }

    public boolean isAllowShowNotify() {
        return this.f10583g;
    }

    public boolean isAsyncInit() {
        return this.f10588l;
    }

    public boolean isDebug() {
        return this.f10584h;
    }

    public boolean isPaid() {
        return this.f10579c;
    }

    public boolean isSupportMultiProcess() {
        return this.f10586j;
    }

    public boolean isUseTextureView() {
        return this.f10585i;
    }

    public void setAllowShowNotify(boolean z10) {
        this.f10583g = z10;
    }

    public void setAppIcon(int i10) {
        this.f10594r = i10;
    }

    public void setAppId(String str) {
        this.f10577a = str;
    }

    public void setAppName(String str) {
        this.f10578b = str;
    }

    public void setAsyncInit(boolean z10) {
        this.f10588l = z10;
    }

    public void setCcpa(int i10) {
        this.f10591o = i10;
    }

    public void setCoppa(int i10) {
        this.f10589m = i10;
    }

    public void setData(String str) {
        this.f10581e = str;
    }

    public void setDebug(boolean z10) {
        this.f10584h = z10;
    }

    public void setDebugLog(int i10) {
        this.f10593q = i10;
    }

    public void setGDPR(int i10) {
        this.f10590n = i10;
    }

    public void setKeywords(String str) {
        this.f10580d = str;
    }

    public void setNeedClearTaskReset(String... strArr) {
        this.f10587k = strArr;
    }

    public void setPackageName(String str) {
        this.f10592p = str;
    }

    public void setPaid(boolean z10) {
        this.f10579c = z10;
    }

    public void setSupportMultiProcess(boolean z10) {
        this.f10586j = z10;
        b.d(z10);
    }

    public void setTitleBarTheme(int i10) {
        this.f10582f = i10;
    }

    public void setUseTextureView(boolean z10) {
        this.f10585i = z10;
    }

    private TTAdConfig() {
        this.f10579c = false;
        this.f10582f = 0;
        this.f10583g = true;
        this.f10584h = false;
        this.f10585i = Build.VERSION.SDK_INT >= 14;
        this.f10586j = false;
        this.f10588l = false;
        this.f10589m = -1;
        this.f10590n = -1;
        this.f10591o = -1;
    }
}
