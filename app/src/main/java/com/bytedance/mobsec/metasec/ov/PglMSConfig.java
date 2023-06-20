package com.bytedance.mobsec.metasec.ov;

import java.util.Map;
import ms.bd.o.Pgl.c;

/* loaded from: classes.dex */
public final class PglMSConfig extends c {

    /* renamed from: o  reason: collision with root package name */
    private final c f9203o;

    /* loaded from: classes.dex */
    public static class Builder extends c.pgla<Builder> {
        public Builder(String str, String str2) {
            super(str, str2);
        }

        public Builder(String str, String str2, int i10) {
            super(str, str2, i10);
        }

        public Builder(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        public Builder(String str, String str2, String str3, int i10) {
            super(str, str2, str3, i10);
        }

        public Builder addAdvanceInfo(String str, String str2) {
            addAdvanceInfo0(str, str2);
            return this;
        }

        public PglMSConfig build() {
            if (this.f34525k == -1 || this.f34526l == 99999) {
                throw new IllegalArgumentException("MSConfig init error!");
            }
            return new PglMSConfig(a());
        }

        public Builder setBDDeviceID(String str) {
            setBDDeviceID0(str);
            return this;
        }

        public Builder setChannel(String str) {
            setChannel0(str);
            return this;
        }

        public Builder setClientType(int i10) {
            setClientType0(i10);
            return this;
        }

        public Builder setCustomInfo(Map<String, String> map) {
            setCustomInfo0(map);
            return this;
        }

        public Builder setDeviceID(String str) {
            setDeviceID0(str);
            return this;
        }

        public Builder setInstallID(String str) {
            setInstallID0(str);
            return this;
        }

        public Builder setOVRegionType(int i10) {
            setOVRegionType0(i10);
            return this;
        }

        public Builder setSecssionID(String str) {
            setSecssionID0(str);
            return this;
        }
    }

    private PglMSConfig(c cVar) {
        this.f9203o = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a() {
        return this.f9203o;
    }
}
