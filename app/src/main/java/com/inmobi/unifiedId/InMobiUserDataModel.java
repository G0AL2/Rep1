package com.inmobi.unifiedId;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class InMobiUserDataModel {

    /* renamed from: a  reason: collision with root package name */
    private final InMobiUserDataTypes f26049a;

    /* renamed from: b  reason: collision with root package name */
    private final InMobiUserDataTypes f26050b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, String> f26051c;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private InMobiUserDataTypes f26052a;

        /* renamed from: b  reason: collision with root package name */
        private InMobiUserDataTypes f26053b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<String, String> f26054c;

        public InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f26052a, this.f26053b, this.f26054c, (byte) 0);
        }

        public Builder emailId(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f26053b = inMobiUserDataTypes;
            return this;
        }

        public Builder extras(HashMap<String, String> hashMap) {
            this.f26054c = hashMap;
            return this;
        }

        public Builder phoneNumber(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f26052a = inMobiUserDataTypes;
            return this;
        }
    }

    /* synthetic */ InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap hashMap, byte b10) {
        this(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    public final boolean equals(Object obj) {
        InMobiUserDataTypes inMobiUserDataTypes;
        InMobiUserDataTypes inMobiUserDataTypes2;
        HashMap<String, String> hashMap;
        boolean z10 = false;
        if (obj != null && (obj instanceof InMobiUserDataModel)) {
            InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
            boolean z11 = ((this.f26049a == null && inMobiUserDataModel.getPhoneNumber() == null) || ((inMobiUserDataTypes = this.f26049a) != null && inMobiUserDataTypes.equals(inMobiUserDataModel.getPhoneNumber()))) & true & ((this.f26050b == null && inMobiUserDataModel.getEmailId() == null) || ((inMobiUserDataTypes2 = this.f26050b) != null && inMobiUserDataTypes2.equals(inMobiUserDataModel.getEmailId())));
            if ((this.f26051c == null && inMobiUserDataModel.getExtras() == null) || ((hashMap = this.f26051c) != null && hashMap.equals(inMobiUserDataModel.getExtras()))) {
                z10 = true;
            }
            return z11 & z10;
        }
        return false;
    }

    public final InMobiUserDataTypes getEmailId() {
        return this.f26050b;
    }

    public final HashMap<String, String> getExtras() {
        return this.f26051c;
    }

    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f26049a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getPhoneNumber(), getEmailId(), getExtras()});
    }

    private InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> hashMap) {
        this.f26049a = inMobiUserDataTypes;
        this.f26050b = inMobiUserDataTypes2;
        this.f26051c = hashMap;
    }
}
