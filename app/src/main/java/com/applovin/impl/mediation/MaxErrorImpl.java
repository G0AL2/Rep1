package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class MaxErrorImpl implements MaxError {
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private final int mediatedNetworkErrorCode;
    private final String mediatedNetworkErrorMessage;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i10) {
        this(i10, "");
    }

    public MaxErrorImpl(int i10, String str) {
        this(i10, str, -1, "");
    }

    public MaxErrorImpl(int i10, String str, int i11, String str2) {
        this.errorCode = i10;
        this.errorMessage = StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i11;
        this.mediatedNetworkErrorMessage = StringUtils.emptyIfNull(str2);
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    @Override // com.applovin.mediation.MaxError
    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(String str) {
        this.loadTag = str;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\"");
        if (getCode() == -4205) {
            sb2.append(", mediatedNetworkErrorCode=");
            sb2.append(getMediatedNetworkErrorCode());
            sb2.append(", mediatedNetworkErrorMessage=\"");
            sb2.append(getMediatedNetworkErrorMessage());
            sb2.append("\"");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
