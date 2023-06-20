package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a0;
import com.fyber.inneractive.sdk.protobuf.i;
import com.fyber.inneractive.sdk.protobuf.j;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.r0;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class AdmParametersOuterClass$AdmParameters extends GeneratedMessageLite<AdmParametersOuterClass$AdmParameters, c> implements r0 {
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 33;
    public static final int ADCOMPLETIONURL_FIELD_NUMBER = 24;
    public static final int ADDOMAIN_FIELD_NUMBER = 29;
    public static final int ADDURATION_FIELD_NUMBER = 25;
    public static final int ADEXPIRATIONINTERVAL_FIELD_NUMBER = 13;
    public static final int ADHEIGHT_FIELD_NUMBER = 5;
    public static final int ADNETWORKID_FIELD_NUMBER = 12;
    public static final int ADNETWORKNAME_FIELD_NUMBER = 11;
    public static final int ADTYPE_FIELD_NUMBER = 14;
    public static final int ADUNITDISPLAYTYPE_FIELD_NUMBER = 8;
    public static final int ADUNITID_FIELD_NUMBER = 6;
    public static final int ADUNITTYPE_FIELD_NUMBER = 7;
    public static final int ADVERTISEDAPPID_FIELD_NUMBER = 18;
    public static final int ADWIDTH_FIELD_NUMBER = 4;
    public static final int APPBUNDLEID_FIELD_NUMBER = 23;
    public static final int CAMPAIGNID_FIELD_NUMBER = 31;
    public static final int CONTENTID_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 30;
    public static final int CREATIVETYPE_FIELD_NUMBER = 26;
    private static final AdmParametersOuterClass$AdmParameters DEFAULT_INSTANCE;
    public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
    public static final int MARKUPURL_FIELD_NUMBER = 1;
    public static final int MRCDATA_FIELD_NUMBER = 32;
    private static volatile y0<AdmParametersOuterClass$AdmParameters> PARSER = null;
    public static final int PRICINGVALUE_FIELD_NUMBER = 28;
    public static final int PUBLISHERID_FIELD_NUMBER = 10;
    public static final int SDKCLICKURL_FIELD_NUMBER = 16;
    public static final int SDKIMPRESSIONURL_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    public static final int SKADNETWORKDATA_FIELD_NUMBER = 27;
    public static final int SKIPMODE_FIELD_NUMBER = 22;
    public static final int SPOTID_FIELD_NUMBER = 34;
    public static final int STORECTATEXT_FIELD_NUMBER = 21;
    public static final int STOREEVENTURL_FIELD_NUMBER = 20;
    public static final int STOREURLTYPE_FIELD_NUMBER = 19;
    public static final int STOREURL_FIELD_NUMBER = 17;
    private int adDuration_;
    private int adExpirationInterval_;
    private int adHeight_;
    private long adNetworkId_;
    private int adType_;
    private int adUnitDisplayType_;
    private int adUnitType_;
    private int adWidth_;
    private int bitField0_;
    private long contentId_;
    private MRCData mrcData_;
    private double pricingValue_;
    private long publisherId_;
    private SKAdNetworkData skAdNetworkData_;
    private boolean skipMode_;
    private long spotId_;
    private int storeUrlType_;
    private String markupUrl_ = "";
    private String sessionId_ = "";
    private String errorMessage_ = "";
    private String adUnitId_ = "";
    private String adNetworkName_ = "";
    private String sdkImpressionUrl_ = "";
    private String sdkClickUrl_ = "";
    private String storeUrl_ = "";
    private String advertisedAppId_ = "";
    private String storeEventUrl_ = "";
    private String storeCTAText_ = "";
    private String appBundleId_ = "";
    private String adCompletionUrl_ = "";
    private String creativeType_ = "";
    private String adDomain_ = "";
    private String creativeId_ = "";
    private String campaignId_ = "";
    private z.j<Experiment> abExperiments_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes.dex */
    public static final class Experiment extends GeneratedMessageLite<Experiment, a> implements e {
        private static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile y0<Experiment> PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<Experiment, a> implements e {
            public a() {
                super(Experiment.DEFAULT_INSTANCE);
            }
        }

        static {
            Experiment experiment = new Experiment();
            DEFAULT_INSTANCE = experiment;
            GeneratedMessageLite.registerDefaultInstance(Experiment.class, experiment);
        }

        private Experiment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<Experiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.identifier_ = iVar.i();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariant(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariantBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.variant_ = iVar.i();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "identifier_", "variant_"});
                case 3:
                    return new Experiment();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<Experiment> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (Experiment.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getIdentifier() {
            return this.identifier_;
        }

        public i getIdentifierBytes() {
            return i.a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public i getVariantBytes() {
            return i.a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(Experiment experiment) {
            return DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Experiment parseFrom(i iVar) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Experiment parseFrom(i iVar, q qVar) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Experiment parseFrom(byte[] bArr) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Experiment parseFrom(byte[] bArr, q qVar) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Experiment parseFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(j jVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Experiment parseFrom(j jVar, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class MRCData extends GeneratedMessageLite<MRCData, a> implements r0 {
        private static final MRCData DEFAULT_INSTANCE;
        private static volatile y0<MRCData> PARSER = null;
        public static final int PIXELDURATION_FIELD_NUMBER = 2;
        public static final int PIXELIMPRESSIONURL_FIELD_NUMBER = 3;
        public static final int PIXELPERCENT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int pixelDuration_;
        private String pixelImpressionUrl_ = "";
        private int pixelPercent_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<MRCData, a> implements r0 {
            public a() {
                super(MRCData.DEFAULT_INSTANCE);
            }
        }

        static {
            MRCData mRCData = new MRCData();
            DEFAULT_INSTANCE = mRCData;
            GeneratedMessageLite.registerDefaultInstance(MRCData.class, mRCData);
        }

        private MRCData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelDuration() {
            this.bitField0_ &= -3;
            this.pixelDuration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelImpressionUrl() {
            this.bitField0_ &= -5;
            this.pixelImpressionUrl_ = getDefaultInstance().getPixelImpressionUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPixelPercent() {
            this.bitField0_ &= -2;
            this.pixelPercent_ = 0;
        }

        public static MRCData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MRCData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MRCData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MRCData parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<MRCData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelDuration(int i10) {
            this.bitField0_ |= 2;
            this.pixelDuration_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelImpressionUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.pixelImpressionUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelImpressionUrlBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.pixelImpressionUrl_ = iVar.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPixelPercent(int i10) {
            this.bitField0_ |= 1;
            this.pixelPercent_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "pixelPercent_", "pixelDuration_", "pixelImpressionUrl_"});
                case 3:
                    return new MRCData();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<MRCData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (MRCData.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getPixelDuration() {
            return this.pixelDuration_;
        }

        public String getPixelImpressionUrl() {
            return this.pixelImpressionUrl_;
        }

        public i getPixelImpressionUrlBytes() {
            return i.a(this.pixelImpressionUrl_);
        }

        public int getPixelPercent() {
            return this.pixelPercent_;
        }

        public boolean hasPixelDuration() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPixelImpressionUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPixelPercent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(MRCData mRCData) {
            return DEFAULT_INSTANCE.createBuilder(mRCData);
        }

        public static MRCData parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MRCData parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MRCData parseFrom(i iVar) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MRCData parseFrom(i iVar, q qVar) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MRCData parseFrom(byte[] bArr) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MRCData parseFrom(byte[] bArr, q qVar) throws a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static MRCData parseFrom(InputStream inputStream) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MRCData parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MRCData parseFrom(j jVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MRCData parseFrom(j jVar, q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class SKAdNetworkData extends GeneratedMessageLite<SKAdNetworkData, a> implements r0 {
        private static final SKAdNetworkData DEFAULT_INSTANCE;
        private static volatile y0<SKAdNetworkData> PARSER = null;
        public static final int SKADNBUNDLE_FIELD_NUMBER = 4;
        public static final int SKADNCAMPIGN_FIELD_NUMBER = 3;
        public static final int SKADNETWORKID_FIELD_NUMBER = 2;
        public static final int SKADNID_FIELD_NUMBER = 5;
        public static final int SKADNIMPID_FIELD_NUMBER = 6;
        public static final int SKADNIMPSIGNATURE_FIELD_NUMBER = 10;
        public static final int SKADNIMPTIMESTAMP_FIELD_NUMBER = 9;
        public static final int SKADNSIGNATURE_FIELD_NUMBER = 11;
        public static final int SKADNSOURCEAPP_FIELD_NUMBER = 7;
        public static final int SKADNTIMESTAMP_FIELD_NUMBER = 8;
        public static final int SKADNVERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private long skAdnImpTimestamp_;
        private long skAdnSourceApp_;
        private long skAdnTimestamp_;
        private String skAdnVersion_ = "";
        private String skAdNetworkId_ = "";
        private String skAdnCampign_ = "";
        private String skAdnBundle_ = "";
        private String skAdnId_ = "";
        private String skAdnImpId_ = "";
        private String skAdnImpSignature_ = "";
        private String skAdnSignature_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<SKAdNetworkData, a> implements r0 {
            public a() {
                super(SKAdNetworkData.DEFAULT_INSTANCE);
            }
        }

        static {
            SKAdNetworkData sKAdNetworkData = new SKAdNetworkData();
            DEFAULT_INSTANCE = sKAdNetworkData;
            GeneratedMessageLite.registerDefaultInstance(SKAdNetworkData.class, sKAdNetworkData);
        }

        private SKAdNetworkData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdNetworkId() {
            this.bitField0_ &= -3;
            this.skAdNetworkId_ = getDefaultInstance().getSkAdNetworkId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnBundle() {
            this.bitField0_ &= -9;
            this.skAdnBundle_ = getDefaultInstance().getSkAdnBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnCampign() {
            this.bitField0_ &= -5;
            this.skAdnCampign_ = getDefaultInstance().getSkAdnCampign();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnId() {
            this.bitField0_ &= -17;
            this.skAdnId_ = getDefaultInstance().getSkAdnId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpId() {
            this.bitField0_ &= -33;
            this.skAdnImpId_ = getDefaultInstance().getSkAdnImpId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpSignature() {
            this.bitField0_ &= -513;
            this.skAdnImpSignature_ = getDefaultInstance().getSkAdnImpSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnImpTimestamp() {
            this.bitField0_ &= -257;
            this.skAdnImpTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnSignature() {
            this.bitField0_ &= -1025;
            this.skAdnSignature_ = getDefaultInstance().getSkAdnSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnSourceApp() {
            this.bitField0_ &= -65;
            this.skAdnSourceApp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnTimestamp() {
            this.bitField0_ &= -129;
            this.skAdnTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkAdnVersion() {
            this.bitField0_ &= -2;
            this.skAdnVersion_ = getDefaultInstance().getSkAdnVersion();
        }

        public static SKAdNetworkData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SKAdNetworkData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKAdNetworkData parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<SKAdNetworkData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdNetworkId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.skAdNetworkId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdNetworkIdBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdNetworkId_ = iVar.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnBundle(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.skAdnBundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnBundleBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnBundle_ = iVar.i();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnCampign(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.skAdnCampign_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnCampignBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnCampign_ = iVar.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.skAdnId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnIdBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnId_ = iVar.i();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.skAdnImpId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpIdBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnImpId_ = iVar.i();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpSignature(String str) {
            str.getClass();
            this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.skAdnImpSignature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpSignatureBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnImpSignature_ = iVar.i();
            this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnImpTimestamp(long j10) {
            this.bitField0_ |= 256;
            this.skAdnImpTimestamp_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSignature(String str) {
            str.getClass();
            this.bitField0_ |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            this.skAdnSignature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSignatureBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnSignature_ = iVar.i();
            this.bitField0_ |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnSourceApp(long j10) {
            this.bitField0_ |= 64;
            this.skAdnSourceApp_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnTimestamp(long j10) {
            this.bitField0_ |= 128;
            this.skAdnTimestamp_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnVersion(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.skAdnVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkAdnVersionBytes(i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.skAdnVersion_ = iVar.i();
            this.bitField0_ |= 1;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဃ\u0006\bဃ\u0007\tတ\b\nለ\t\u000bለ\n", new Object[]{"bitField0_", "skAdnVersion_", "skAdNetworkId_", "skAdnCampign_", "skAdnBundle_", "skAdnId_", "skAdnImpId_", "skAdnSourceApp_", "skAdnTimestamp_", "skAdnImpTimestamp_", "skAdnImpSignature_", "skAdnSignature_"});
                case 3:
                    return new SKAdNetworkData();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<SKAdNetworkData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (SKAdNetworkData.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getSkAdNetworkId() {
            return this.skAdNetworkId_;
        }

        public i getSkAdNetworkIdBytes() {
            return i.a(this.skAdNetworkId_);
        }

        public String getSkAdnBundle() {
            return this.skAdnBundle_;
        }

        public i getSkAdnBundleBytes() {
            return i.a(this.skAdnBundle_);
        }

        public String getSkAdnCampign() {
            return this.skAdnCampign_;
        }

        public i getSkAdnCampignBytes() {
            return i.a(this.skAdnCampign_);
        }

        public String getSkAdnId() {
            return this.skAdnId_;
        }

        public i getSkAdnIdBytes() {
            return i.a(this.skAdnId_);
        }

        public String getSkAdnImpId() {
            return this.skAdnImpId_;
        }

        public i getSkAdnImpIdBytes() {
            return i.a(this.skAdnImpId_);
        }

        public String getSkAdnImpSignature() {
            return this.skAdnImpSignature_;
        }

        public i getSkAdnImpSignatureBytes() {
            return i.a(this.skAdnImpSignature_);
        }

        public long getSkAdnImpTimestamp() {
            return this.skAdnImpTimestamp_;
        }

        public String getSkAdnSignature() {
            return this.skAdnSignature_;
        }

        public i getSkAdnSignatureBytes() {
            return i.a(this.skAdnSignature_);
        }

        public long getSkAdnSourceApp() {
            return this.skAdnSourceApp_;
        }

        public long getSkAdnTimestamp() {
            return this.skAdnTimestamp_;
        }

        public String getSkAdnVersion() {
            return this.skAdnVersion_;
        }

        public i getSkAdnVersionBytes() {
            return i.a(this.skAdnVersion_);
        }

        public boolean hasSkAdNetworkId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSkAdnBundle() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSkAdnCampign() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSkAdnId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSkAdnImpId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSkAdnImpSignature() {
            return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        public boolean hasSkAdnImpTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSkAdnSignature() {
            return (this.bitField0_ & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0;
        }

        public boolean hasSkAdnSourceApp() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSkAdnTimestamp() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSkAdnVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(SKAdNetworkData sKAdNetworkData) {
            return DEFAULT_INSTANCE.createBuilder(sKAdNetworkData);
        }

        public static SKAdNetworkData parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SKAdNetworkData parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static SKAdNetworkData parseFrom(i iVar) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static SKAdNetworkData parseFrom(i iVar, q qVar) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static SKAdNetworkData parseFrom(byte[] bArr) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKAdNetworkData parseFrom(byte[] bArr, q qVar) throws a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static SKAdNetworkData parseFrom(InputStream inputStream) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKAdNetworkData parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SKAdNetworkData parseFrom(j jVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SKAdNetworkData parseFrom(j jVar, q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends GeneratedMessageLite.a<AdmParametersOuterClass$AdmParameters, c> implements r0 {
        public c() {
            super(AdmParametersOuterClass$AdmParameters.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public enum d implements z.c {
        MANUAL(0),
        AUTOMATIC(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16768a;

        d(int i10) {
            this.f16768a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16768a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* loaded from: classes.dex */
    public interface e extends r0 {
    }

    static {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = new AdmParametersOuterClass$AdmParameters();
        DEFAULT_INSTANCE = admParametersOuterClass$AdmParameters;
        GeneratedMessageLite.registerDefaultInstance(AdmParametersOuterClass$AdmParameters.class, admParametersOuterClass$AdmParameters);
    }

    private AdmParametersOuterClass$AdmParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAbExperiments(Iterable<? extends Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.abExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdCompletionUrl() {
        this.bitField0_ &= -1048577;
        this.adCompletionUrl_ = getDefaultInstance().getAdCompletionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDomain() {
        this.bitField0_ &= -33554433;
        this.adDomain_ = getDefaultInstance().getAdDomain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDuration() {
        this.bitField0_ &= -2097153;
        this.adDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExpirationInterval() {
        this.bitField0_ &= -1025;
        this.adExpirationInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdHeight() {
        this.bitField0_ &= -17;
        this.adHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNetworkId() {
        this.bitField0_ &= -513;
        this.adNetworkId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdNetworkName() {
        this.bitField0_ &= -257;
        this.adNetworkName_ = getDefaultInstance().getAdNetworkName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdType() {
        this.adType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitDisplayType() {
        this.adUnitDisplayType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitId() {
        this.bitField0_ &= -33;
        this.adUnitId_ = getDefaultInstance().getAdUnitId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnitType() {
        this.adUnitType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdWidth() {
        this.bitField0_ &= -9;
        this.adWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisedAppId() {
        this.bitField0_ &= -16385;
        this.advertisedAppId_ = getDefaultInstance().getAdvertisedAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBundleId() {
        this.bitField0_ &= -524289;
        this.appBundleId_ = getDefaultInstance().getAppBundleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -134217729;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentId() {
        this.bitField0_ &= -65;
        this.contentId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.bitField0_ &= -67108865;
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeType() {
        this.bitField0_ &= -4194305;
        this.creativeType_ = getDefaultInstance().getCreativeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -5;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkupUrl() {
        this.bitField0_ &= -2;
        this.markupUrl_ = getDefaultInstance().getMarkupUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMrcData() {
        this.mrcData_ = null;
        this.bitField0_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPricingValue() {
        this.bitField0_ &= -16777217;
        this.pricingValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisherId() {
        this.bitField0_ &= -129;
        this.publisherId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkClickUrl() {
        this.bitField0_ &= -4097;
        this.sdkClickUrl_ = getDefaultInstance().getSdkClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkImpressionUrl() {
        this.bitField0_ &= -2049;
        this.sdkImpressionUrl_ = getDefaultInstance().getSdkImpressionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkAdNetworkData() {
        this.skAdNetworkData_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipMode() {
        this.bitField0_ &= -262145;
        this.skipMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpotId() {
        this.bitField0_ &= -536870913;
        this.spotId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreCTAText() {
        this.bitField0_ &= -131073;
        this.storeCTAText_ = getDefaultInstance().getStoreCTAText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreEventUrl() {
        this.bitField0_ &= -65537;
        this.storeEventUrl_ = getDefaultInstance().getStoreEventUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreUrl() {
        this.bitField0_ &= -8193;
        this.storeUrl_ = getDefaultInstance().getStoreUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreUrlType() {
        this.bitField0_ &= -32769;
        this.storeUrlType_ = 0;
    }

    private void ensureAbExperimentsIsMutable() {
        z.j<Experiment> jVar = this.abExperiments_;
        if (jVar.d()) {
            return;
        }
        this.abExperiments_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static AdmParametersOuterClass$AdmParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMrcData(MRCData mRCData) {
        mRCData.getClass();
        MRCData mRCData2 = this.mrcData_;
        if (mRCData2 != null && mRCData2 != MRCData.getDefaultInstance()) {
            MRCData.a newBuilder = MRCData.newBuilder(this.mrcData_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, mRCData);
            this.mrcData_ = newBuilder.b();
        } else {
            this.mrcData_ = mRCData;
        }
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkAdNetworkData(SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        SKAdNetworkData sKAdNetworkData2 = this.skAdNetworkData_;
        if (sKAdNetworkData2 != null && sKAdNetworkData2 != SKAdNetworkData.getDefaultInstance()) {
            SKAdNetworkData.a newBuilder = SKAdNetworkData.newBuilder(this.skAdNetworkData_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, sKAdNetworkData);
            this.skAdNetworkData_ = newBuilder.b();
        } else {
            this.skAdNetworkData_ = sKAdNetworkData;
        }
        this.bitField0_ |= 8388608;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AdmParametersOuterClass$AdmParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(ByteBuffer byteBuffer) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0<AdmParametersOuterClass$AdmParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAbExperiments(int i10) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i10, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCompletionUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1048576;
        this.adCompletionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCompletionUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adCompletionUrl_ = iVar.i();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDomain(String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.adDomain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDomainBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adDomain_ = iVar.i();
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDuration(int i10) {
        this.bitField0_ |= 2097152;
        this.adDuration_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExpirationInterval(int i10) {
        this.bitField0_ |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        this.adExpirationInterval_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdHeight(int i10) {
        this.bitField0_ |= 16;
        this.adHeight_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkId(long j10) {
        this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
        this.adNetworkId_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.adNetworkName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdNetworkNameBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adNetworkName_ = iVar.i();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdType(a aVar) {
        this.adType_ = aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdTypeValue(int i10) {
        this.adType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitDisplayType(f fVar) {
        this.adUnitDisplayType_ = fVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitDisplayTypeValue(int i10) {
        this.adUnitDisplayType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.adUnitId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adUnitId_ = iVar.i();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitType(b bVar) {
        this.adUnitType_ = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnitTypeValue(int i10) {
        this.adUnitType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdWidth(int i10) {
        this.bitField0_ |= 8;
        this.adWidth_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisedAppId(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.advertisedAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisedAppIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.advertisedAppId_ = iVar.i();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBundleId(String str) {
        str.getClass();
        this.bitField0_ |= 524288;
        this.appBundleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBundleIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.appBundleId_ = iVar.i();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.campaignId_ = iVar.i();
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentId(long j10) {
        this.bitField0_ |= 64;
        this.contentId_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.bitField0_ |= 67108864;
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.creativeId_ = iVar.i();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeType(String str) {
        str.getClass();
        this.bitField0_ |= 4194304;
        this.creativeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeTypeBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.creativeType_ = iVar.i();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.errorMessage_ = iVar.i();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkupUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.markupUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkupUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.markupUrl_ = iVar.i();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMrcData(MRCData mRCData) {
        mRCData.getClass();
        this.mrcData_ = mRCData;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPricingValue(double d10) {
        this.bitField0_ |= 16777216;
        this.pricingValue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherId(long j10) {
        this.bitField0_ |= 128;
        this.publisherId_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkClickUrl(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.sdkClickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkClickUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.sdkClickUrl_ = iVar.i();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkImpressionUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.sdkImpressionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkImpressionUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.sdkImpressionUrl_ = iVar.i();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.sessionId_ = iVar.i();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkAdNetworkData(SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        this.skAdNetworkData_ = sKAdNetworkData;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipMode(boolean z10) {
        this.bitField0_ |= 262144;
        this.skipMode_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpotId(long j10) {
        this.bitField0_ |= 536870912;
        this.spotId_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreCTAText(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.storeCTAText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreCTATextBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.storeCTAText_ = iVar.i();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreEventUrl(String str) {
        str.getClass();
        this.bitField0_ |= Constants.MIN_PROGRESS_STEP;
        this.storeEventUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreEventUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.storeEventUrl_ = iVar.i();
        this.bitField0_ |= Constants.MIN_PROGRESS_STEP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrl(String str) {
        str.getClass();
        this.bitField0_ |= Constants.BUFFER_SIZE;
        this.storeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlBytes(i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.storeUrl_ = iVar.i();
        this.bitField0_ |= Constants.BUFFER_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlType(d dVar) {
        this.storeUrlType_ = dVar.a();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreUrlTypeValue(int i10) {
        this.bitField0_ |= 32768;
        this.storeUrlType_ = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\"\u0000\u0001\u0001\"\"\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ለ\u0005\u0007\f\b\f\tဃ\u0006\nဃ\u0007\u000bለ\b\fဃ\t\rင\n\u000e\f\u000fለ\u000b\u0010ለ\f\u0011ለ\r\u0012ለ\u000e\u0013ဌ\u000f\u0014ለ\u0010\u0015ለ\u0011\u0016ဇ\u0012\u0017ለ\u0013\u0018ለ\u0014\u0019ဋ\u0015\u001aለ\u0016\u001bဉ\u0017\u001cက\u0018\u001dለ\u0019\u001eለ\u001a\u001fለ\u001b ဉ\u001c!\u001b\"ဃ\u001d", new Object[]{"bitField0_", "markupUrl_", "sessionId_", "errorMessage_", "adWidth_", "adHeight_", "adUnitId_", "adUnitType_", "adUnitDisplayType_", "contentId_", "publisherId_", "adNetworkName_", "adNetworkId_", "adExpirationInterval_", "adType_", "sdkImpressionUrl_", "sdkClickUrl_", "storeUrl_", "advertisedAppId_", "storeUrlType_", "storeEventUrl_", "storeCTAText_", "skipMode_", "appBundleId_", "adCompletionUrl_", "adDuration_", "creativeType_", "skAdNetworkData_", "pricingValue_", "adDomain_", "creativeId_", "campaignId_", "mrcData_", "abExperiments_", Experiment.class, "spotId_"});
            case 3:
                return new AdmParametersOuterClass$AdmParameters();
            case 4:
                return new c();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                y0<AdmParametersOuterClass$AdmParameters> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (AdmParametersOuterClass$AdmParameters.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Experiment getAbExperiments(int i10) {
        return this.abExperiments_.get(i10);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public List<Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public e getAbExperimentsOrBuilder(int i10) {
        return this.abExperiments_.get(i10);
    }

    public List<? extends e> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public String getAdCompletionUrl() {
        return this.adCompletionUrl_;
    }

    public i getAdCompletionUrlBytes() {
        return i.a(this.adCompletionUrl_);
    }

    public String getAdDomain() {
        return this.adDomain_;
    }

    public i getAdDomainBytes() {
        return i.a(this.adDomain_);
    }

    public int getAdDuration() {
        return this.adDuration_;
    }

    public int getAdExpirationInterval() {
        return this.adExpirationInterval_;
    }

    public int getAdHeight() {
        return this.adHeight_;
    }

    public long getAdNetworkId() {
        return this.adNetworkId_;
    }

    public String getAdNetworkName() {
        return this.adNetworkName_;
    }

    public i getAdNetworkNameBytes() {
        return i.a(this.adNetworkName_);
    }

    public a getAdType() {
        a a10 = a.a(this.adType_);
        return a10 == null ? a.UNRECOGNIZED : a10;
    }

    public int getAdTypeValue() {
        return this.adType_;
    }

    public f getAdUnitDisplayType() {
        f a10 = f.a(this.adUnitDisplayType_);
        return a10 == null ? f.UNRECOGNIZED : a10;
    }

    public int getAdUnitDisplayTypeValue() {
        return this.adUnitDisplayType_;
    }

    public String getAdUnitId() {
        return this.adUnitId_;
    }

    public i getAdUnitIdBytes() {
        return i.a(this.adUnitId_);
    }

    public b getAdUnitType() {
        b a10 = b.a(this.adUnitType_);
        return a10 == null ? b.UNRECOGNIZED : a10;
    }

    public int getAdUnitTypeValue() {
        return this.adUnitType_;
    }

    public int getAdWidth() {
        return this.adWidth_;
    }

    public String getAdvertisedAppId() {
        return this.advertisedAppId_;
    }

    public i getAdvertisedAppIdBytes() {
        return i.a(this.advertisedAppId_);
    }

    public String getAppBundleId() {
        return this.appBundleId_;
    }

    public i getAppBundleIdBytes() {
        return i.a(this.appBundleId_);
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public i getCampaignIdBytes() {
        return i.a(this.campaignId_);
    }

    public long getContentId() {
        return this.contentId_;
    }

    public String getCreativeId() {
        return this.creativeId_;
    }

    public i getCreativeIdBytes() {
        return i.a(this.creativeId_);
    }

    public String getCreativeType() {
        return this.creativeType_;
    }

    public i getCreativeTypeBytes() {
        return i.a(this.creativeType_);
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public i getErrorMessageBytes() {
        return i.a(this.errorMessage_);
    }

    public String getMarkupUrl() {
        return this.markupUrl_;
    }

    public i getMarkupUrlBytes() {
        return i.a(this.markupUrl_);
    }

    public MRCData getMrcData() {
        MRCData mRCData = this.mrcData_;
        return mRCData == null ? MRCData.getDefaultInstance() : mRCData;
    }

    public double getPricingValue() {
        return this.pricingValue_;
    }

    public long getPublisherId() {
        return this.publisherId_;
    }

    public String getSdkClickUrl() {
        return this.sdkClickUrl_;
    }

    public i getSdkClickUrlBytes() {
        return i.a(this.sdkClickUrl_);
    }

    public String getSdkImpressionUrl() {
        return this.sdkImpressionUrl_;
    }

    public i getSdkImpressionUrlBytes() {
        return i.a(this.sdkImpressionUrl_);
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public i getSessionIdBytes() {
        return i.a(this.sessionId_);
    }

    public SKAdNetworkData getSkAdNetworkData() {
        SKAdNetworkData sKAdNetworkData = this.skAdNetworkData_;
        return sKAdNetworkData == null ? SKAdNetworkData.getDefaultInstance() : sKAdNetworkData;
    }

    public boolean getSkipMode() {
        return this.skipMode_;
    }

    public long getSpotId() {
        return this.spotId_;
    }

    public String getStoreCTAText() {
        return this.storeCTAText_;
    }

    public i getStoreCTATextBytes() {
        return i.a(this.storeCTAText_);
    }

    public String getStoreEventUrl() {
        return this.storeEventUrl_;
    }

    public i getStoreEventUrlBytes() {
        return i.a(this.storeEventUrl_);
    }

    public String getStoreUrl() {
        return this.storeUrl_;
    }

    public i getStoreUrlBytes() {
        return i.a(this.storeUrl_);
    }

    public d getStoreUrlType() {
        d dVar;
        int i10 = this.storeUrlType_;
        if (i10 != 0) {
            dVar = i10 != 1 ? null : d.AUTOMATIC;
        } else {
            dVar = d.MANUAL;
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }

    public int getStoreUrlTypeValue() {
        return this.storeUrlType_;
    }

    public boolean hasAdCompletionUrl() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasAdDomain() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasAdDuration() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasAdExpirationInterval() {
        return (this.bitField0_ & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0;
    }

    public boolean hasAdHeight() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAdNetworkId() {
        return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    public boolean hasAdNetworkName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAdUnitId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAdWidth() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAdvertisedAppId() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppBundleId() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasContentId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCreativeId() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasCreativeType() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMarkupUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMrcData() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasPricingValue() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasPublisherId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSdkClickUrl() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSdkImpressionUrl() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSkAdNetworkData() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasSkipMode() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasSpotId() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasStoreCTAText() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasStoreEventUrl() {
        return (this.bitField0_ & Constants.MIN_PROGRESS_STEP) != 0;
    }

    public boolean hasStoreUrl() {
        return (this.bitField0_ & Constants.BUFFER_SIZE) != 0;
    }

    public boolean hasStoreUrlType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static c newBuilder(AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters) {
        return DEFAULT_INSTANCE.createBuilder(admParametersOuterClass$AdmParameters);
    }

    public static AdmParametersOuterClass$AdmParameters parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    /* loaded from: classes.dex */
    public enum a implements z.c {
        OTHER(0),
        HTML(4),
        MRAID(6),
        VAST(8),
        DV360(15),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16757a;

        a(int i10) {
            this.f16757a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16757a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static a a(int i10) {
            if (i10 != 0) {
                if (i10 != 4) {
                    if (i10 != 6) {
                        if (i10 != 8) {
                            if (i10 != 15) {
                                return null;
                            }
                            return DV360;
                        }
                        return VAST;
                    }
                    return MRAID;
                }
                return HTML;
            }
            return OTHER;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements z.c {
        DISPLAY(0),
        VIDEO(1),
        VIDEOANDDISPLAY(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16763a;

        b(int i10) {
            this.f16763a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16763a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static b a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return VIDEOANDDISPLAY;
                }
                return VIDEO;
            }
            return DISPLAY;
        }
    }

    /* loaded from: classes.dex */
    public enum f implements z.c {
        UNITDISPLAYTYPEUNKNOWN(0),
        BANNER(1),
        INTERSTITIAL(2),
        REWARDED(3),
        MRECT(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16776a;

        f(int i10) {
            this.f16776a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16776a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static f a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return null;
                            }
                            return MRECT;
                        }
                        return REWARDED;
                    }
                    return INTERSTITIAL;
                }
                return BANNER;
            }
            return UNITDISPLAYTYPEUNKNOWN;
        }
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(i iVar) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i10, experiment);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(i iVar, q qVar) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr, q qVar) throws a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(InputStream inputStream) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(j jVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(j jVar, q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
