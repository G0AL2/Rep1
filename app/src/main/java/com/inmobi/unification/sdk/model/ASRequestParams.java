package com.inmobi.unification.sdk.model;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ASRequestParams {

    /* renamed from: a  reason: collision with root package name */
    public String f26040a;

    /* renamed from: b  reason: collision with root package name */
    public String f26041b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f26042c;

    /* renamed from: d  reason: collision with root package name */
    public String f26043d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26044e;

    /* loaded from: classes3.dex */
    public static class Builder {
        private String a9Params;
        private Map<String, String> bidToken;
        private boolean hasDynamicMediation;
        private String pubKeys;
        private String vcUserId;

        public ASRequestParams build() {
            ASRequestParams aSRequestParams = new ASRequestParams();
            aSRequestParams.f26040a = this.pubKeys;
            aSRequestParams.f26041b = this.a9Params;
            aSRequestParams.f26042c = this.bidToken;
            aSRequestParams.f26043d = this.vcUserId;
            aSRequestParams.f26044e = this.hasDynamicMediation;
            return aSRequestParams;
        }

        public Builder setA9Params(String str) {
            this.a9Params = str;
            return this;
        }

        public Builder setBidToken(Map<String, String> map) {
            this.bidToken = map;
            return this;
        }

        public Builder setHasDynamicMediation(boolean z10) {
            this.hasDynamicMediation = z10;
            return this;
        }

        public Builder setPubKeys(String str) {
            this.pubKeys = str;
            return this;
        }

        public Builder setVcUserId(String str) {
            this.vcUserId = str;
            return this;
        }
    }
}
