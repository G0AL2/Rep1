package com.inmobi.unifiedId;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class InMobiUserDataTypes {
    protected String md5;
    protected String sha1;
    protected String sha256;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        protected String f26055a;

        /* renamed from: b  reason: collision with root package name */
        protected String f26056b;

        /* renamed from: c  reason: collision with root package name */
        protected String f26057c;

        public InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f26055a, this.f26056b, this.f26057c, (byte) 0);
        }

        public Builder md5(String str) {
            this.f26055a = str;
            return this;
        }

        public Builder sha1(String str) {
            this.f26056b = str;
            return this;
        }

        public Builder sha256(String str) {
            this.f26057c = str;
            return this;
        }
    }

    /* synthetic */ InMobiUserDataTypes(String str, String str2, String str3, byte b10) {
        this(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InMobiUserDataTypes) {
            InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
            boolean z11 = ((this.md5 == null && inMobiUserDataTypes.getMd5() == null) || ((str = this.md5) != null && str.equals(inMobiUserDataTypes.getMd5()))) & true & ((this.sha1 == null && inMobiUserDataTypes.getSha1() == null) || ((str2 = this.sha1) != null && str2.equals(inMobiUserDataTypes.getSha1())));
            if ((this.sha256 != null || inMobiUserDataTypes.getSha256() != null) && ((str3 = this.sha256) == null || !str3.equals(inMobiUserDataTypes.getSha256()))) {
                z10 = false;
            }
            return z11 & z10;
        }
        return false;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.md5, this.sha1, this.sha256});
    }

    private InMobiUserDataTypes(String str, String str2, String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }
}
