package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a0;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.r0;
import com.fyber.inneractive.sdk.protobuf.y;
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
public final class TokenParametersOuterClass$TokenParameters extends GeneratedMessageLite<TokenParametersOuterClass$TokenParameters, b> implements r0 {
    public static final int AAID_FIELD_NUMBER = 54;
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 63;
    public static final int AIRPLANEMODE_FIELD_NUMBER = 50;
    public static final int AMAZONID_FIELD_NUMBER = 53;
    public static final int APPBUILDVERSION_FIELD_NUMBER = 55;
    public static final int APPVERSION_FIELD_NUMBER = 6;
    public static final int BATTERYCHARGING_FIELD_NUMBER = 43;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 44;
    public static final int BLUETOOTHPLUGGED_FIELD_NUMBER = 46;
    public static final int BUNDLEID_FIELD_NUMBER = 4;
    public static final int CARRIERNAME_FIELD_NUMBER = 18;
    public static final int CCPASTRING_FIELD_NUMBER = 27;
    public static final int COUNTRYCODE_FIELD_NUMBER = 17;
    public static final int DARKMODE_FIELD_NUMBER = 49;
    private static final TokenParametersOuterClass$TokenParameters DEFAULT_INSTANCE;
    public static final int DEVICEAPI_FIELD_NUMBER = 8;
    public static final int DEVICEHEIGHT_FIELD_NUMBER = 13;
    public static final int DEVICELANGUAGE_FIELD_NUMBER = 10;
    public static final int DEVICEMODEL_FIELD_NUMBER = 5;
    public static final int DEVICEOS_FIELD_NUMBER = 7;
    public static final int DEVICEWIDTH_FIELD_NUMBER = 12;
    public static final int DNDMODE_FIELD_NUMBER = 51;
    public static final int DNT_FIELD_NUMBER = 24;
    public static final int FRAMEWORKNAME_FIELD_NUMBER = 15;
    public static final int FREESPACE_FIELD_NUMBER = 47;
    public static final int GDPRCONSENT_FIELD_NUMBER = 25;
    public static final int GDPRSTRING_FIELD_NUMBER = 26;
    public static final int HEADSETPLUGGED_FIELD_NUMBER = 45;
    public static final int HORACCURACY_FIELD_NUMBER = 39;
    public static final int IDFA_FIELD_NUMBER = 22;
    public static final int IDFV_FIELD_NUMBER = 23;
    public static final int INPUTLANGUAGES_FIELD_NUMBER = 21;
    public static final int ISRINGMUTED_FIELD_NUMBER = 52;
    public static final int KEYWORDS_FIELD_NUMBER = 36;
    public static final int LASTADOMAINS_FIELD_NUMBER = 57;
    public static final int LASTADVERTISEDBUNDLES_FIELD_NUMBER = 58;
    public static final int LATITUDE_FIELD_NUMBER = 37;
    public static final int LGPDCONSENT_FIELD_NUMBER = 66;
    public static final int LONGITUDE_FIELD_NUMBER = 38;
    public static final int LOWPOWERMODE_FIELD_NUMBER = 48;
    public static final int MEDIATIONTYPE_FIELD_NUMBER = 14;
    public static final int MOBILECOUNTRYCODE_FIELD_NUMBER = 19;
    public static final int MOBILENETWORKCODE_FIELD_NUMBER = 20;
    public static final int MOCKRESPONSEID_FIELD_NUMBER = 65;
    public static final int MUTEAUDIO_FIELD_NUMBER = 32;
    public static final int NETWORK_FIELD_NUMBER = 31;
    public static final int OFFSETFROMGMT_FIELD_NUMBER = 28;
    public static final int OSVERSION_FIELD_NUMBER = 9;
    private static volatile y0<TokenParametersOuterClass$TokenParameters> PARSER = null;
    public static final int PORTAL_FIELD_NUMBER = 64;
    public static final int PRIORCLICKS_FIELD_NUMBER = 59;
    public static final int PRIORCLICKTYPES_FIELD_NUMBER = 61;
    public static final int PRIORSKIP_FIELD_NUMBER = 60;
    public static final int PXRATIO_FIELD_NUMBER = 11;
    public static final int SDKVERSION_FIELD_NUMBER = 3;
    public static final int SECURECONTENT_FIELD_NUMBER = 42;
    public static final int SESSIONDURATION_FIELD_NUMBER = 56;
    public static final int TIMEACCURACY_FIELD_NUMBER = 41;
    public static final int TOTALSPACE_FIELD_NUMBER = 16;
    public static final int TRACKINGSTATUS_FIELD_NUMBER = 29;
    public static final int USERAGENT_FIELD_NUMBER = 2;
    public static final int USERAGE_FIELD_NUMBER = 33;
    public static final int USERGENDER_FIELD_NUMBER = 34;
    public static final int USERID_FIELD_NUMBER = 30;
    public static final int USERSESSIONS_FIELD_NUMBER = 62;
    public static final int VERACCURACY_FIELD_NUMBER = 40;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int ZIPCODE_FIELD_NUMBER = 35;
    private static final z.h.a<Integer, k> priorClicks_converter_ = new a();
    private NullableString aaid_;
    private NullableBool airplaneMode_;
    private NullableString amazonId_;
    private NullableString appBuildVersion_;
    private NullableString appVersion_;
    private NullableBool batteryCharging_;
    private NullableUInt32 batteryLevel_;
    private int bitField0_;
    private NullableBool bluetoothPlugged_;
    private NullableString bundleID_;
    private NullableString carrierName_;
    private NullableString ccpaString_;
    private NullableString countryCode_;
    private boolean darkMode_;
    private NullableUInt32 deviceApi_;
    private NullableUInt32 deviceHeight_;
    private NullableString deviceLanguage_;
    private NullableString deviceModel_;
    private NullableString deviceOS_;
    private NullableUInt32 deviceWidth_;
    private NullableBool dndMode_;
    private boolean dnt_;
    private int frameworkName_;
    private NullableUInt32 freeSpace_;
    private NullableBool gdprConsent_;
    private NullableString gdprString_;
    private NullableBool headsetPlugged_;
    private NullableFloat horAccuracy_;
    private NullableString idfa_;
    private NullableString idfv_;
    private NullableString inputLanguages_;
    private NullableBool isRingMuted_;
    private NullableString keywords_;
    private NullableFloat latitude_;
    private NullableBool lgpdConsent_;
    private NullableFloat longitude_;
    private NullableBool lowPowerMode_;
    private NullableString mediationType_;
    private NullableString mobileCountryCode_;
    private NullableString mobileNetworkCode_;
    private NullableString mockResponseId_;
    private boolean muteAudio_;
    private NullableString network_;
    private NullableSInt32 offsetFromGMT_;
    private NullableString osVersion_;
    private NullableUInt32 portal_;
    private int priorClicksMemoizedSerializedSize;
    private NullableBool priorSkip_;
    private NullableFloat pxRatio_;
    private NullableString sdkVersion_;
    private int secureContent_;
    private NullableUInt32 sessionDuration_;
    private NullableFloat timeAccuracy_;
    private NullableUInt32 totalSpace_;
    private NullableUInt32 trackingStatus_;
    private NullableUInt32 userAge_;
    private NullableString userAgent_;
    private int userGender_;
    private NullableString userID_;
    private NullableFloat verAccuracy_;
    private NullableString version_;
    private NullableString zipCode_;
    private z.j<LastAdomain> lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    private z.j<LastAdvertisedBundle> lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    private z.g priorClicks_ = GeneratedMessageLite.emptyIntList();
    private z.j<PriorVideoClickType> priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    private z.j<UserSession> userSessions_ = GeneratedMessageLite.emptyProtobufList();
    private z.j<Experiment> abExperiments_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes.dex */
    public static final class Experiment extends GeneratedMessageLite<Experiment, a> implements c {
        private static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile y0<Experiment> PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<Experiment, a> implements c {
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
        public void setIdentifierBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
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
        public void setVariantBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
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

        public com.fyber.inneractive.sdk.protobuf.i getIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getVariantBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.variant_);
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

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
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

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class LastAdomain extends GeneratedMessageLite<LastAdomain, a> implements e {
        public static final int ADOMAIN_FIELD_NUMBER = 2;
        private static final LastAdomain DEFAULT_INSTANCE;
        private static volatile y0<LastAdomain> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String adomain_ = "";
        private int bitField0_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<LastAdomain, a> implements e {
            public a() {
                super(LastAdomain.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdomain lastAdomain = new LastAdomain();
            DEFAULT_INSTANCE = lastAdomain;
            GeneratedMessageLite.registerDefaultInstance(LastAdomain.class, lastAdomain);
        }

        private LastAdomain() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdomain() {
            this.bitField0_ &= -3;
            this.adomain_ = getDefaultInstance().getAdomain();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdomain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<LastAdomain> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomain(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomainBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.adomain_ = iVar.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "adomain_"});
                case 3:
                    return new LastAdomain();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<LastAdomain> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (LastAdomain.class) {
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

        public String getAdomain() {
            return this.adomain_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getAdomainBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.adomain_);
        }

        public k getType() {
            k a10 = k.a(this.type_);
            return a10 == null ? k.UNRECOGNIZED : a10;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasAdomain() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(LastAdomain lastAdomain) {
            return DEFAULT_INSTANCE.createBuilder(lastAdomain);
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdomain parseFrom(byte[] bArr) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdomain parseFrom(byte[] bArr, q qVar) throws a0 {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdomain parseFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class LastAdvertisedBundle extends GeneratedMessageLite<LastAdvertisedBundle, a> implements f {
        private static final LastAdvertisedBundle DEFAULT_INSTANCE;
        public static final int LASTBUNDLE_FIELD_NUMBER = 2;
        private static volatile y0<LastAdvertisedBundle> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String lastBundle_ = "";
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<LastAdvertisedBundle, a> implements f {
            public a() {
                super(LastAdvertisedBundle.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdvertisedBundle lastAdvertisedBundle = new LastAdvertisedBundle();
            DEFAULT_INSTANCE = lastAdvertisedBundle;
            GeneratedMessageLite.registerDefaultInstance(LastAdvertisedBundle.class, lastAdvertisedBundle);
        }

        private LastAdvertisedBundle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastBundle() {
            this.bitField0_ &= -3;
            this.lastBundle_ = getDefaultInstance().getLastBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdvertisedBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<LastAdvertisedBundle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundle(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.lastBundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundleBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.lastBundle_ = iVar.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "lastBundle_"});
                case 3:
                    return new LastAdvertisedBundle();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<LastAdvertisedBundle> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (LastAdvertisedBundle.class) {
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

        public String getLastBundle() {
            return this.lastBundle_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getLastBundleBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.lastBundle_);
        }

        public k getType() {
            k a10 = k.a(this.type_);
            return a10 == null ? k.UNRECOGNIZED : a10;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasLastBundle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(LastAdvertisedBundle lastAdvertisedBundle) {
            return DEFAULT_INSTANCE.createBuilder(lastAdvertisedBundle);
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr, q qVar) throws a0 {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableBool extends GeneratedMessageLite<NullableBool, a> implements r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableBool DEFAULT_INSTANCE;
        private static volatile y0<NullableBool> PARSER;
        private int bitField0_;
        private boolean data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<NullableBool, a> implements r0 {
            public a() {
                super(NullableBool.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableBool nullableBool = new NullableBool();
            DEFAULT_INSTANCE = nullableBool;
            GeneratedMessageLite.registerDefaultInstance(NullableBool.class, nullableBool);
        }

        private NullableBool() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = false;
        }

        public static NullableBool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<NullableBool> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(boolean z10) {
            this.bitField0_ |= 1;
            this.data_ = z10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableBool();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<NullableBool> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableBool.class) {
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

        public boolean getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableBool nullableBool) {
            return DEFAULT_INSTANCE.createBuilder(nullableBool);
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableBool parseFrom(byte[] bArr) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableBool parseFrom(byte[] bArr, q qVar) throws a0 {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableBool parseFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableFloat extends GeneratedMessageLite<NullableFloat, a> implements r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableFloat DEFAULT_INSTANCE;
        private static volatile y0<NullableFloat> PARSER;
        private int bitField0_;
        private float data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<NullableFloat, a> implements r0 {
            public a() {
                super(NullableFloat.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableFloat nullableFloat = new NullableFloat();
            DEFAULT_INSTANCE = nullableFloat;
            GeneratedMessageLite.registerDefaultInstance(NullableFloat.class, nullableFloat);
        }

        private NullableFloat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0.0f;
        }

        public static NullableFloat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<NullableFloat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(float f10) {
            this.bitField0_ |= 1;
            this.data_ = f10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableFloat();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<NullableFloat> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableFloat.class) {
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

        public float getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableFloat nullableFloat) {
            return DEFAULT_INSTANCE.createBuilder(nullableFloat);
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableFloat parseFrom(byte[] bArr) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableFloat parseFrom(byte[] bArr, q qVar) throws a0 {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableFloat parseFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableSInt32 extends GeneratedMessageLite<NullableSInt32, a> implements r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableSInt32 DEFAULT_INSTANCE;
        private static volatile y0<NullableSInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<NullableSInt32, a> implements r0 {
            public a() {
                super(NullableSInt32.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableSInt32 nullableSInt32 = new NullableSInt32();
            DEFAULT_INSTANCE = nullableSInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableSInt32.class, nullableSInt32);
        }

        private NullableSInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableSInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<NullableSInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i10) {
            this.bitField0_ |= 1;
            this.data_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableSInt32();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<NullableSInt32> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableSInt32.class) {
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

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableSInt32 nullableSInt32) {
            return DEFAULT_INSTANCE.createBuilder(nullableSInt32);
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableSInt32 parseFrom(byte[] bArr) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableSInt32 parseFrom(byte[] bArr, q qVar) throws a0 {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableString extends GeneratedMessageLite<NullableString, a> implements r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableString DEFAULT_INSTANCE;
        private static volatile y0<NullableString> PARSER;
        private int bitField0_;
        private String data_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<NullableString, a> implements r0 {
            public a() {
                super(NullableString.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableString nullableString = new NullableString();
            DEFAULT_INSTANCE = nullableString;
            GeneratedMessageLite.registerDefaultInstance(NullableString.class, nullableString);
        }

        private NullableString() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        public static NullableString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<NullableString> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.data_ = iVar.i();
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableString();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<NullableString> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableString.class) {
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

        public String getData() {
            return this.data_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getDataBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.data_);
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableString nullableString) {
            return DEFAULT_INSTANCE.createBuilder(nullableString);
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableString parseFrom(byte[] bArr) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableString parseFrom(byte[] bArr, q qVar) throws a0 {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableString parseFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableUInt32 extends GeneratedMessageLite<NullableUInt32, a> implements r0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableUInt32 DEFAULT_INSTANCE;
        private static volatile y0<NullableUInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<NullableUInt32, a> implements r0 {
            public a() {
                super(NullableUInt32.DEFAULT_INSTANCE);
            }

            public a a(int i10) {
                c();
                ((NullableUInt32) this.f19803b).setData(i10);
                return this;
            }
        }

        static {
            NullableUInt32 nullableUInt32 = new NullableUInt32();
            DEFAULT_INSTANCE = nullableUInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableUInt32.class, nullableUInt32);
        }

        private NullableUInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableUInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<NullableUInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i10) {
            this.bitField0_ |= 1;
            this.data_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "data_"});
                case 3:
                    return new NullableUInt32();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<NullableUInt32> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (NullableUInt32.class) {
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

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableUInt32 nullableUInt32) {
            return DEFAULT_INSTANCE.createBuilder(nullableUInt32);
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableUInt32 parseFrom(byte[] bArr) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableUInt32 parseFrom(byte[] bArr, q qVar) throws a0 {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class PriorVideoClickType extends GeneratedMessageLite<PriorVideoClickType, a> implements g {
        public static final int CLICKTYPE_FIELD_NUMBER = 2;
        private static final PriorVideoClickType DEFAULT_INSTANCE;
        private static volatile y0<PriorVideoClickType> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int clickType_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<PriorVideoClickType, a> implements g {
            public a() {
                super(PriorVideoClickType.DEFAULT_INSTANCE);
            }
        }

        static {
            PriorVideoClickType priorVideoClickType = new PriorVideoClickType();
            DEFAULT_INSTANCE = priorVideoClickType;
            GeneratedMessageLite.registerDefaultInstance(PriorVideoClickType.class, priorVideoClickType);
        }

        private PriorVideoClickType() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickType() {
            this.bitField0_ &= -3;
            this.clickType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static PriorVideoClickType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<PriorVideoClickType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickType(n nVar) {
            this.clickType_ = nVar.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickTypeValue(int i10) {
            this.bitField0_ |= 2;
            this.clickType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "type_", "clickType_"});
                case 3:
                    return new PriorVideoClickType();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<PriorVideoClickType> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (PriorVideoClickType.class) {
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

        public n getClickType() {
            n a10 = n.a(this.clickType_);
            return a10 == null ? n.UNRECOGNIZED : a10;
        }

        public int getClickTypeValue() {
            return this.clickType_;
        }

        public k getType() {
            k a10 = k.a(this.type_);
            return a10 == null ? k.UNRECOGNIZED : a10;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasClickType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(PriorVideoClickType priorVideoClickType) {
            return DEFAULT_INSTANCE.createBuilder(priorVideoClickType);
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr, q qVar) throws a0 {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class SessionData extends GeneratedMessageLite<SessionData, a> implements i {
        public static final int CLICKS_FIELD_NUMBER = 2;
        public static final int COMPLETIONS_FIELD_NUMBER = 3;
        private static final SessionData DEFAULT_INSTANCE;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static volatile y0<SessionData> PARSER;
        private int bitField0_;
        private int clicks_;
        private int completions_;
        private int impressions_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<SessionData, a> implements i {
            public a() {
                super(SessionData.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionData sessionData = new SessionData();
            DEFAULT_INSTANCE = sessionData;
            GeneratedMessageLite.registerDefaultInstance(SessionData.class, sessionData);
        }

        private SessionData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClicks() {
            this.bitField0_ &= -3;
            this.clicks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompletions() {
            this.bitField0_ &= -5;
            this.completions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressions() {
            this.bitField0_ &= -2;
            this.impressions_ = 0;
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<SessionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClicks(int i10) {
            this.bitField0_ |= 2;
            this.clicks_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompletions(int i10) {
            this.bitField0_ |= 4;
            this.completions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressions(int i10) {
            this.bitField0_ |= 1;
            this.impressions_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "impressions_", "clicks_", "completions_"});
                case 3:
                    return new SessionData();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<SessionData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (SessionData.class) {
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

        public int getClicks() {
            return this.clicks_;
        }

        public int getCompletions() {
            return this.completions_;
        }

        public int getImpressions() {
            return this.impressions_;
        }

        public boolean hasClicks() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCompletions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasImpressions() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.createBuilder(sessionData);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static SessionData parseFrom(byte[] bArr) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionData parseFrom(byte[] bArr, q qVar) throws a0 {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class UserSession extends GeneratedMessageLite<UserSession, a> implements m {
        private static final UserSession DEFAULT_INSTANCE;
        private static volatile y0<UserSession> PARSER = null;
        public static final int SESSIONDATAITEMS_FIELD_NUMBER = 3;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private z.j<SessionData> sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        private int subType_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.a<UserSession, a> implements m {
            public a() {
                super(UserSession.DEFAULT_INSTANCE);
            }
        }

        static {
            UserSession userSession = new UserSession();
            DEFAULT_INSTANCE = userSession;
            GeneratedMessageLite.registerDefaultInstance(UserSession.class, userSession);
        }

        private UserSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSessionDataItems(Iterable<? extends SessionData> iterable) {
            ensureSessionDataItemsIsMutable();
            com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.sessionDataItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionDataItems() {
            this.sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -3;
            this.subType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureSessionDataItemsIsMutable() {
            z.j<SessionData> jVar = this.sessionDataItems_;
            if (jVar.d()) {
                return;
            }
            this.sessionDataItems_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static y0<UserSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSessionDataItems(int i10) {
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionDataItems(int i10, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.set(i10, sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubType(j jVar) {
            this.subType_ = jVar.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTypeValue(int i10) {
            this.bitField0_ |= 2;
            this.subType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", "subType_", "sessionDataItems_", SessionData.class});
                case 3:
                    return new UserSession();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    y0<UserSession> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (UserSession.class) {
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

        public SessionData getSessionDataItems(int i10) {
            return this.sessionDataItems_.get(i10);
        }

        public int getSessionDataItemsCount() {
            return this.sessionDataItems_.size();
        }

        public List<SessionData> getSessionDataItemsList() {
            return this.sessionDataItems_;
        }

        public i getSessionDataItemsOrBuilder(int i10) {
            return this.sessionDataItems_.get(i10);
        }

        public List<? extends i> getSessionDataItemsOrBuilderList() {
            return this.sessionDataItems_;
        }

        public j getSubType() {
            j a10 = j.a(this.subType_);
            return a10 == null ? j.UNRECOGNIZED : a10;
        }

        public int getSubTypeValue() {
            return this.subType_;
        }

        public k getType() {
            k a10 = k.a(this.type_);
            return a10 == null ? k.UNRECOGNIZED : a10;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(UserSession userSession) {
            return DEFAULT_INSTANCE.createBuilder(userSession);
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(int i10, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(i10, sessionData);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static UserSession parseFrom(byte[] bArr) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserSession parseFrom(byte[] bArr, q qVar) throws a0 {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public class a implements z.h.a<Integer, k> {
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<TokenParametersOuterClass$TokenParameters, b> implements r0 {
        public b() {
            super(TokenParametersOuterClass$TokenParameters.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public interface c extends r0 {
    }

    /* loaded from: classes.dex */
    public enum d implements z.c {
        NATIVE(0),
        UNITY3D(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16706a;

        d(int i10) {
            this.f16706a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16706a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* loaded from: classes.dex */
    public interface e extends r0 {
    }

    /* loaded from: classes.dex */
    public interface f extends r0 {
    }

    /* loaded from: classes.dex */
    public interface g extends r0 {
    }

    /* loaded from: classes.dex */
    public interface i extends r0 {
    }

    /* loaded from: classes.dex */
    public interface m extends r0 {
    }

    static {
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = new TokenParametersOuterClass$TokenParameters();
        DEFAULT_INSTANCE = tokenParametersOuterClass$TokenParameters;
        GeneratedMessageLite.registerDefaultInstance(TokenParametersOuterClass$TokenParameters.class, tokenParametersOuterClass$TokenParameters);
    }

    private TokenParametersOuterClass$TokenParameters() {
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
    public void addAllLastAdomains(Iterable<? extends LastAdomain> iterable) {
        ensureLastAdomainsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.lastAdomains_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastAdvertisedBundles(Iterable<? extends LastAdvertisedBundle> iterable) {
        ensureLastAdvertisedBundlesIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.lastAdvertisedBundles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClickTypes(Iterable<? extends PriorVideoClickType> iterable) {
        ensurePriorClickTypesIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.priorClickTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicks(Iterable<? extends k> iterable) {
        ensurePriorClicksIsMutable();
        for (k kVar : iterable) {
            ((y) this.priorClicks_).c(kVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicksValue(Iterable<Integer> iterable) {
        ensurePriorClicksIsMutable();
        for (Integer num : iterable) {
            ((y) this.priorClicks_).c(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUserSessions(Iterable<? extends UserSession> iterable) {
        ensureUserSessionsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.userSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicks(k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        ((y) this.priorClicks_).c(kVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicksValue(int i10) {
        ensurePriorClicksIsMutable();
        ((y) this.priorClicks_).c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAaid() {
        this.aaid_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAirplaneMode() {
        this.airplaneMode_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmazonId() {
        this.amazonId_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBuildVersion() {
        this.appBuildVersion_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryCharging() {
        this.batteryCharging_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.batteryLevel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPlugged() {
        this.bluetoothPlugged_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleID() {
        this.bundleID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarrierName() {
        this.carrierName_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcpaString() {
        this.ccpaString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkMode() {
        this.darkMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceApi() {
        this.deviceApi_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceHeight() {
        this.deviceHeight_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceLanguage() {
        this.deviceLanguage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOS() {
        this.deviceOS_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceWidth() {
        this.deviceWidth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDndMode() {
        this.dndMode_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnt() {
        this.bitField0_ &= -17;
        this.dnt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameworkName() {
        this.frameworkName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeSpace() {
        this.freeSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprConsent() {
        this.gdprConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprString() {
        this.gdprString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadsetPlugged() {
        this.headsetPlugged_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorAccuracy() {
        this.horAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfa() {
        this.idfa_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputLanguages() {
        this.inputLanguages_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRingMuted() {
        this.isRingMuted_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeywords() {
        this.keywords_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdomains() {
        this.lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdvertisedBundles() {
        this.lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgpdConsent() {
        this.lgpdConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowPowerMode() {
        this.lowPowerMode_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationType() {
        this.mediationType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileCountryCode() {
        this.mobileCountryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileNetworkCode() {
        this.mobileNetworkCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockResponseId() {
        this.mockResponseId_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuteAudio() {
        this.muteAudio_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetFromGMT() {
        this.offsetFromGMT_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortal() {
        this.portal_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClickTypes() {
        this.priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClicks() {
        this.priorClicks_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorSkip() {
        this.priorSkip_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPxRatio() {
        this.pxRatio_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecureContent() {
        this.secureContent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionDuration() {
        this.sessionDuration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeAccuracy() {
        this.timeAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSpace() {
        this.totalSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackingStatus() {
        this.trackingStatus_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAge() {
        this.userAge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGender() {
        this.userGender_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserID() {
        this.userID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSessions() {
        this.userSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerAccuracy() {
        this.verAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZipCode() {
        this.zipCode_ = null;
    }

    private void ensureAbExperimentsIsMutable() {
        z.j<Experiment> jVar = this.abExperiments_;
        if (jVar.d()) {
            return;
        }
        this.abExperiments_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureLastAdomainsIsMutable() {
        z.j<LastAdomain> jVar = this.lastAdomains_;
        if (jVar.d()) {
            return;
        }
        this.lastAdomains_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureLastAdvertisedBundlesIsMutable() {
        z.j<LastAdvertisedBundle> jVar = this.lastAdvertisedBundles_;
        if (jVar.d()) {
            return;
        }
        this.lastAdvertisedBundles_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensurePriorClickTypesIsMutable() {
        z.j<PriorVideoClickType> jVar = this.priorClickTypes_;
        if (jVar.d()) {
            return;
        }
        this.priorClickTypes_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensurePriorClicksIsMutable() {
        z.g gVar = this.priorClicks_;
        if (((com.fyber.inneractive.sdk.protobuf.c) gVar).f19843a) {
            return;
        }
        this.priorClicks_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    private void ensureUserSessionsIsMutable() {
        z.j<UserSession> jVar = this.userSessions_;
        if (jVar.d()) {
            return;
        }
        this.userSessions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static TokenParametersOuterClass$TokenParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAaid(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.aaid_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.aaid_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.aaid_ = newBuilder.b();
        } else {
            this.aaid_ = nullableString;
        }
        this.bitField0_ |= Constants.BUFFER_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.airplaneMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.airplaneMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.airplaneMode_ = newBuilder.b();
        } else {
            this.airplaneMode_ = nullableBool;
        }
        this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAmazonId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.amazonId_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.amazonId_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.amazonId_ = newBuilder.b();
        } else {
            this.amazonId_ = nullableString;
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appBuildVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.appBuildVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.appBuildVersion_ = newBuilder.b();
        } else {
            this.appBuildVersion_ = nullableString;
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.appVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.appVersion_ = newBuilder.b();
            return;
        }
        this.appVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.batteryCharging_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.batteryCharging_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.batteryCharging_ = newBuilder.b();
            return;
        }
        this.batteryCharging_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.batteryLevel_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.batteryLevel_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.batteryLevel_ = newBuilder.b();
            return;
        }
        this.batteryLevel_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.bluetoothPlugged_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.bluetoothPlugged_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.bluetoothPlugged_ = newBuilder.b();
        } else {
            this.bluetoothPlugged_ = nullableBool;
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBundleID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.bundleID_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.bundleID_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.bundleID_ = newBuilder.b();
            return;
        }
        this.bundleID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarrierName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.carrierName_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.carrierName_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.carrierName_ = newBuilder.b();
            return;
        }
        this.carrierName_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCcpaString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ccpaString_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.ccpaString_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.ccpaString_ = newBuilder.b();
            return;
        }
        this.ccpaString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.countryCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.countryCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.countryCode_ = newBuilder.b();
            return;
        }
        this.countryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceApi_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceApi_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.deviceApi_ = newBuilder.b();
        } else {
            this.deviceApi_ = nullableUInt32;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceHeight_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceHeight_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.deviceHeight_ = newBuilder.b();
            return;
        }
        this.deviceHeight_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceLanguage_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceLanguage_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.deviceLanguage_ = newBuilder.b();
            return;
        }
        this.deviceLanguage_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceModel_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceModel_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.deviceModel_ = newBuilder.b();
            return;
        }
        this.deviceModel_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceOS_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceOS_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.deviceOS_ = newBuilder.b();
            return;
        }
        this.deviceOS_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceWidth_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceWidth_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.deviceWidth_ = newBuilder.b();
            return;
        }
        this.deviceWidth_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.dndMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.dndMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.dndMode_ = newBuilder.b();
        } else {
            this.dndMode_ = nullableBool;
        }
        this.bitField0_ |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.freeSpace_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.freeSpace_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.freeSpace_ = newBuilder.b();
            return;
        }
        this.freeSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.gdprConsent_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.gdprConsent_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.gdprConsent_ = newBuilder.b();
            return;
        }
        this.gdprConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.gdprString_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.gdprString_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.gdprString_ = newBuilder.b();
            return;
        }
        this.gdprString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.headsetPlugged_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.headsetPlugged_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.headsetPlugged_ = newBuilder.b();
        } else {
            this.headsetPlugged_ = nullableBool;
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.horAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.horAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.horAccuracy_ = newBuilder.b();
            return;
        }
        this.horAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfa(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfa_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.idfa_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.idfa_ = newBuilder.b();
        } else {
            this.idfa_ = nullableString;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfv(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfv_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.idfv_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.idfv_ = newBuilder.b();
        } else {
            this.idfv_ = nullableString;
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.inputLanguages_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.inputLanguages_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.inputLanguages_ = newBuilder.b();
            return;
        }
        this.inputLanguages_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.isRingMuted_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.isRingMuted_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.isRingMuted_ = newBuilder.b();
        } else {
            this.isRingMuted_ = nullableBool;
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeywords(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.keywords_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.keywords_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.keywords_ = newBuilder.b();
            return;
        }
        this.keywords_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.latitude_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.latitude_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.latitude_ = newBuilder.b();
            return;
        }
        this.latitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lgpdConsent_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.lgpdConsent_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.lgpdConsent_ = newBuilder.b();
            return;
        }
        this.lgpdConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.longitude_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.longitude_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.longitude_ = newBuilder.b();
            return;
        }
        this.longitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lowPowerMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.lowPowerMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.lowPowerMode_ = newBuilder.b();
        } else {
            this.lowPowerMode_ = nullableBool;
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediationType(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mediationType_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mediationType_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.mediationType_ = newBuilder.b();
            return;
        }
        this.mediationType_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileCountryCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mobileCountryCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.mobileCountryCode_ = newBuilder.b();
            return;
        }
        this.mobileCountryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileNetworkCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mobileNetworkCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.mobileNetworkCode_ = newBuilder.b();
            return;
        }
        this.mobileNetworkCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mockResponseId_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mockResponseId_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.mockResponseId_ = newBuilder.b();
        } else {
            this.mockResponseId_ = nullableString;
        }
        this.bitField0_ |= Constants.MIN_PROGRESS_STEP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetwork(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.network_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.network_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.network_ = newBuilder.b();
            return;
        }
        this.network_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        NullableSInt32 nullableSInt322 = this.offsetFromGMT_;
        if (nullableSInt322 != null && nullableSInt322 != NullableSInt32.getDefaultInstance()) {
            NullableSInt32.a newBuilder = NullableSInt32.newBuilder(this.offsetFromGMT_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableSInt32);
            this.offsetFromGMT_ = newBuilder.b();
            return;
        }
        this.offsetFromGMT_ = nullableSInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.osVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.osVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.osVersion_ = newBuilder.b();
            return;
        }
        this.osVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.portal_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.portal_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.portal_ = newBuilder.b();
        } else {
            this.portal_ = nullableUInt32;
        }
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.priorSkip_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.priorSkip_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableBool);
            this.priorSkip_ = newBuilder.b();
            return;
        }
        this.priorSkip_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.pxRatio_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.pxRatio_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.pxRatio_ = newBuilder.b();
        } else {
            this.pxRatio_ = nullableFloat;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.sdkVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.sdkVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.sdkVersion_ = newBuilder.b();
            return;
        }
        this.sdkVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.sessionDuration_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.sessionDuration_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.sessionDuration_ = newBuilder.b();
            return;
        }
        this.sessionDuration_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.timeAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.timeAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.timeAccuracy_ = newBuilder.b();
            return;
        }
        this.timeAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.totalSpace_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.totalSpace_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.totalSpace_ = newBuilder.b();
            return;
        }
        this.totalSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.trackingStatus_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.trackingStatus_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.trackingStatus_ = newBuilder.b();
        } else {
            this.trackingStatus_ = nullableUInt32;
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.userAge_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.userAge_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableUInt32);
            this.userAge_ = newBuilder.b();
            return;
        }
        this.userAge_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgent(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userAgent_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.userAgent_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.userAgent_ = newBuilder.b();
            return;
        }
        this.userAgent_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userID_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.userID_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.userID_ = newBuilder.b();
            return;
        }
        this.userID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.verAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.verAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableFloat);
            this.verAccuracy_ = newBuilder.b();
            return;
        }
        this.verAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.version_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.version_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.version_ = newBuilder.b();
            return;
        }
        this.version_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZipCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.zipCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.zipCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.f19803b, nullableString);
            this.zipCode_ = newBuilder.b();
            return;
        }
        this.zipCode_ = nullableString;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0<TokenParametersOuterClass$TokenParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAbExperiments(int i10) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdomains(int i10) {
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdvertisedBundles(int i10) {
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePriorClickTypes(int i10) {
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUserSessions(int i10) {
        ensureUserSessionsIsMutable();
        this.userSessions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAaid(NullableString nullableString) {
        nullableString.getClass();
        this.aaid_ = nullableString;
        this.bitField0_ |= Constants.BUFFER_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i10, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.airplaneMode_ = nullableBool;
        this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmazonId(NullableString nullableString) {
        nullableString.getClass();
        this.amazonId_ = nullableString;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appBuildVersion_ = nullableString;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        this.batteryCharging_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.batteryLevel_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.bluetoothPlugged_ = nullableBool;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleID(NullableString nullableString) {
        nullableString.getClass();
        this.bundleID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarrierName(NullableString nullableString) {
        nullableString.getClass();
        this.carrierName_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcpaString(NullableString nullableString) {
        nullableString.getClass();
        this.ccpaString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.countryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkMode(boolean z10) {
        this.darkMode_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceApi_ = nullableUInt32;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceHeight_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        this.deviceLanguage_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        this.deviceModel_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        this.deviceOS_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceWidth_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.dndMode_ = nullableBool;
        this.bitField0_ |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnt(boolean z10) {
        this.bitField0_ |= 16;
        this.dnt_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkName(d dVar) {
        this.frameworkName_ = dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkNameValue(int i10) {
        this.frameworkName_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.freeSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.gdprConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprString(NullableString nullableString) {
        nullableString.getClass();
        this.gdprString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.headsetPlugged_ = nullableBool;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.horAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfa(NullableString nullableString) {
        nullableString.getClass();
        this.idfa_ = nullableString;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(NullableString nullableString) {
        nullableString.getClass();
        this.idfv_ = nullableString;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        this.inputLanguages_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        this.isRingMuted_ = nullableBool;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeywords(NullableString nullableString) {
        nullableString.getClass();
        this.keywords_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdomains(int i10, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.set(i10, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdvertisedBundles(int i10, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.set(i10, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.latitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lgpdConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.longitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lowPowerMode_ = nullableBool;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationType(NullableString nullableString) {
        nullableString.getClass();
        this.mediationType_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileCountryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileNetworkCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        this.mockResponseId_ = nullableString;
        this.bitField0_ |= Constants.MIN_PROGRESS_STEP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuteAudio(boolean z10) {
        this.muteAudio_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(NullableString nullableString) {
        nullableString.getClass();
        this.network_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        this.offsetFromGMT_ = nullableSInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(NullableString nullableString) {
        nullableString.getClass();
        this.osVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.portal_ = nullableUInt32;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClickTypes(int i10, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.set(i10, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicks(int i10, k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        z.g gVar = this.priorClicks_;
        int a10 = kVar.a();
        y yVar = (y) gVar;
        yVar.e();
        yVar.d(i10);
        int[] iArr = yVar.f20076b;
        int i11 = iArr[i10];
        iArr[i10] = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicksValue(int i10, int i11) {
        ensurePriorClicksIsMutable();
        y yVar = (y) this.priorClicks_;
        yVar.e();
        yVar.d(i10);
        int[] iArr = yVar.f20076b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        this.priorSkip_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.pxRatio_ = nullableFloat;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        this.sdkVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContent(h hVar) {
        this.secureContent_ = hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContentValue(int i10) {
        this.secureContent_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.sessionDuration_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.timeAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.totalSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.trackingStatus_ = nullableUInt32;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.userAge_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(NullableString nullableString) {
        nullableString.getClass();
        this.userAgent_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGender(l lVar) {
        this.userGender_ = lVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGenderValue(int i10) {
        this.userGender_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserID(NullableString nullableString) {
        nullableString.getClass();
        this.userID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSessions(int i10, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.set(i10, userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.verAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(NullableString nullableString) {
        nullableString.getClass();
        this.version_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipCode(NullableString nullableString) {
        nullableString.getClass();
        this.zipCode_ = nullableString;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000B\u0000\u0001\u0001BB\u0000\u0006\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\bဉ\u0000\t\t\n\t\u000bဉ\u0001\f\t\r\t\u000e\t\u000f\f\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016ဉ\u0002\u0017ဉ\u0003\u0018ဇ\u0004\u0019\t\u001a\t\u001b\t\u001c\t\u001dဉ\u0005\u001e\t\u001f\t \u0007!\t\"\f#\t$\t%\t&\t'\t(\t)\t*\f+\t,\t-ဉ\u0006.ဉ\u0007/\t0ဉ\b1\u00072ဉ\t3ဉ\n4ဉ\u000b5ဉ\f6ဉ\r7ဉ\u000e8\t9\u001b:\u001b;,<\t=\u001b>\u001b?\u001b@ဉ\u000fAဉ\u0010B\t", new Object[]{"bitField0_", "version_", "userAgent_", "sdkVersion_", "bundleID_", "deviceModel_", "appVersion_", "deviceOS_", "deviceApi_", "osVersion_", "deviceLanguage_", "pxRatio_", "deviceWidth_", "deviceHeight_", "mediationType_", "frameworkName_", "totalSpace_", "countryCode_", "carrierName_", "mobileCountryCode_", "mobileNetworkCode_", "inputLanguages_", "idfa_", "idfv_", "dnt_", "gdprConsent_", "gdprString_", "ccpaString_", "offsetFromGMT_", "trackingStatus_", "userID_", "network_", "muteAudio_", "userAge_", "userGender_", "zipCode_", "keywords_", "latitude_", "longitude_", "horAccuracy_", "verAccuracy_", "timeAccuracy_", "secureContent_", "batteryCharging_", "batteryLevel_", "headsetPlugged_", "bluetoothPlugged_", "freeSpace_", "lowPowerMode_", "darkMode_", "airplaneMode_", "dndMode_", "isRingMuted_", "amazonId_", "aaid_", "appBuildVersion_", "sessionDuration_", "lastAdomains_", LastAdomain.class, "lastAdvertisedBundles_", LastAdvertisedBundle.class, "priorClicks_", "priorSkip_", "priorClickTypes_", PriorVideoClickType.class, "userSessions_", UserSession.class, "abExperiments_", Experiment.class, "portal_", "mockResponseId_", "lgpdConsent_"});
            case 3:
                return new TokenParametersOuterClass$TokenParameters();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                y0<TokenParametersOuterClass$TokenParameters> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (TokenParametersOuterClass$TokenParameters.class) {
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

    public NullableString getAaid() {
        NullableString nullableString = this.aaid_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
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

    public c getAbExperimentsOrBuilder(int i10) {
        return this.abExperiments_.get(i10);
    }

    public List<? extends c> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public NullableBool getAirplaneMode() {
        NullableBool nullableBool = this.airplaneMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getAmazonId() {
        NullableString nullableString = this.amazonId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppBuildVersion() {
        NullableString nullableString = this.appBuildVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppVersion() {
        NullableString nullableString = this.appVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getBatteryCharging() {
        NullableBool nullableBool = this.batteryCharging_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableUInt32 getBatteryLevel() {
        NullableUInt32 nullableUInt32 = this.batteryLevel_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getBluetoothPlugged() {
        NullableBool nullableBool = this.bluetoothPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getBundleID() {
        NullableString nullableString = this.bundleID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCarrierName() {
        NullableString nullableString = this.carrierName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCcpaString() {
        NullableString nullableString = this.ccpaString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCountryCode() {
        NullableString nullableString = this.countryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public NullableUInt32 getDeviceApi() {
        NullableUInt32 nullableUInt32 = this.deviceApi_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getDeviceHeight() {
        NullableUInt32 nullableUInt32 = this.deviceHeight_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getDeviceLanguage() {
        NullableString nullableString = this.deviceLanguage_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceModel() {
        NullableString nullableString = this.deviceModel_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceOS() {
        NullableString nullableString = this.deviceOS_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getDeviceWidth() {
        NullableUInt32 nullableUInt32 = this.deviceWidth_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getDndMode() {
        NullableBool nullableBool = this.dndMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public boolean getDnt() {
        return this.dnt_;
    }

    public d getFrameworkName() {
        d dVar;
        int i10 = this.frameworkName_;
        if (i10 != 0) {
            dVar = i10 != 1 ? null : d.UNITY3D;
        } else {
            dVar = d.NATIVE;
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }

    public int getFrameworkNameValue() {
        return this.frameworkName_;
    }

    public NullableUInt32 getFreeSpace() {
        NullableUInt32 nullableUInt32 = this.freeSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getGdprConsent() {
        NullableBool nullableBool = this.gdprConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getGdprString() {
        NullableString nullableString = this.gdprString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getHeadsetPlugged() {
        NullableBool nullableBool = this.headsetPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getHorAccuracy() {
        NullableFloat nullableFloat = this.horAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getIdfa() {
        NullableString nullableString = this.idfa_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIdfv() {
        NullableString nullableString = this.idfv_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getInputLanguages() {
        NullableString nullableString = this.inputLanguages_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getIsRingMuted() {
        NullableBool nullableBool = this.isRingMuted_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getKeywords() {
        NullableString nullableString = this.keywords_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public LastAdomain getLastAdomains(int i10) {
        return this.lastAdomains_.get(i10);
    }

    public int getLastAdomainsCount() {
        return this.lastAdomains_.size();
    }

    public List<LastAdomain> getLastAdomainsList() {
        return this.lastAdomains_;
    }

    public e getLastAdomainsOrBuilder(int i10) {
        return this.lastAdomains_.get(i10);
    }

    public List<? extends e> getLastAdomainsOrBuilderList() {
        return this.lastAdomains_;
    }

    public LastAdvertisedBundle getLastAdvertisedBundles(int i10) {
        return this.lastAdvertisedBundles_.get(i10);
    }

    public int getLastAdvertisedBundlesCount() {
        return this.lastAdvertisedBundles_.size();
    }

    public List<LastAdvertisedBundle> getLastAdvertisedBundlesList() {
        return this.lastAdvertisedBundles_;
    }

    public f getLastAdvertisedBundlesOrBuilder(int i10) {
        return this.lastAdvertisedBundles_.get(i10);
    }

    public List<? extends f> getLastAdvertisedBundlesOrBuilderList() {
        return this.lastAdvertisedBundles_;
    }

    public NullableFloat getLatitude() {
        NullableFloat nullableFloat = this.latitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLgpdConsent() {
        NullableBool nullableBool = this.lgpdConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getLongitude() {
        NullableFloat nullableFloat = this.longitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLowPowerMode() {
        NullableBool nullableBool = this.lowPowerMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getMediationType() {
        NullableString nullableString = this.mediationType_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileCountryCode() {
        NullableString nullableString = this.mobileCountryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileNetworkCode() {
        NullableString nullableString = this.mobileNetworkCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMockResponseId() {
        NullableString nullableString = this.mockResponseId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getMuteAudio() {
        return this.muteAudio_;
    }

    public NullableString getNetwork() {
        NullableString nullableString = this.network_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableSInt32 getOffsetFromGMT() {
        NullableSInt32 nullableSInt32 = this.offsetFromGMT_;
        return nullableSInt32 == null ? NullableSInt32.getDefaultInstance() : nullableSInt32;
    }

    public NullableString getOsVersion() {
        NullableString nullableString = this.osVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getPortal() {
        NullableUInt32 nullableUInt32 = this.portal_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public PriorVideoClickType getPriorClickTypes(int i10) {
        return this.priorClickTypes_.get(i10);
    }

    public int getPriorClickTypesCount() {
        return this.priorClickTypes_.size();
    }

    public List<PriorVideoClickType> getPriorClickTypesList() {
        return this.priorClickTypes_;
    }

    public g getPriorClickTypesOrBuilder(int i10) {
        return this.priorClickTypes_.get(i10);
    }

    public List<? extends g> getPriorClickTypesOrBuilderList() {
        return this.priorClickTypes_;
    }

    public k getPriorClicks(int i10) {
        z.h.a<Integer, k> aVar = priorClicks_converter_;
        y yVar = (y) this.priorClicks_;
        yVar.d(i10);
        Integer valueOf = Integer.valueOf(yVar.f20076b[i10]);
        ((a) aVar).getClass();
        k a10 = k.a(valueOf.intValue());
        return a10 == null ? k.UNRECOGNIZED : a10;
    }

    public int getPriorClicksCount() {
        return ((y) this.priorClicks_).size();
    }

    public List<k> getPriorClicksList() {
        return new z.h(this.priorClicks_, priorClicks_converter_);
    }

    public int getPriorClicksValue(int i10) {
        y yVar = (y) this.priorClicks_;
        yVar.d(i10);
        return yVar.f20076b[i10];
    }

    public List<Integer> getPriorClicksValueList() {
        return this.priorClicks_;
    }

    public NullableBool getPriorSkip() {
        NullableBool nullableBool = this.priorSkip_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getPxRatio() {
        NullableFloat nullableFloat = this.pxRatio_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getSdkVersion() {
        NullableString nullableString = this.sdkVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public h getSecureContent() {
        h a10 = h.a(this.secureContent_);
        return a10 == null ? h.UNRECOGNIZED : a10;
    }

    public int getSecureContentValue() {
        return this.secureContent_;
    }

    public NullableUInt32 getSessionDuration() {
        NullableUInt32 nullableUInt32 = this.sessionDuration_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableFloat getTimeAccuracy() {
        NullableFloat nullableFloat = this.timeAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableUInt32 getTotalSpace() {
        NullableUInt32 nullableUInt32 = this.totalSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getTrackingStatus() {
        NullableUInt32 nullableUInt32 = this.trackingStatus_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getUserAge() {
        NullableUInt32 nullableUInt32 = this.userAge_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getUserAgent() {
        NullableString nullableString = this.userAgent_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public l getUserGender() {
        l a10 = l.a(this.userGender_);
        return a10 == null ? l.UNRECOGNIZED : a10;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public NullableString getUserID() {
        NullableString nullableString = this.userID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public UserSession getUserSessions(int i10) {
        return this.userSessions_.get(i10);
    }

    public int getUserSessionsCount() {
        return this.userSessions_.size();
    }

    public List<UserSession> getUserSessionsList() {
        return this.userSessions_;
    }

    public m getUserSessionsOrBuilder(int i10) {
        return this.userSessions_.get(i10);
    }

    public List<? extends m> getUserSessionsOrBuilderList() {
        return this.userSessions_;
    }

    public NullableFloat getVerAccuracy() {
        NullableFloat nullableFloat = this.verAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getVersion() {
        NullableString nullableString = this.version_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getZipCode() {
        NullableString nullableString = this.zipCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean hasAaid() {
        return (this.bitField0_ & Constants.BUFFER_SIZE) != 0;
    }

    public boolean hasAirplaneMode() {
        return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    public boolean hasAmazonId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppBuildVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppVersion() {
        return this.appVersion_ != null;
    }

    public boolean hasBatteryCharging() {
        return this.batteryCharging_ != null;
    }

    public boolean hasBatteryLevel() {
        return this.batteryLevel_ != null;
    }

    public boolean hasBluetoothPlugged() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBundleID() {
        return this.bundleID_ != null;
    }

    public boolean hasCarrierName() {
        return this.carrierName_ != null;
    }

    public boolean hasCcpaString() {
        return this.ccpaString_ != null;
    }

    public boolean hasCountryCode() {
        return this.countryCode_ != null;
    }

    public boolean hasDeviceApi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceHeight() {
        return this.deviceHeight_ != null;
    }

    public boolean hasDeviceLanguage() {
        return this.deviceLanguage_ != null;
    }

    public boolean hasDeviceModel() {
        return this.deviceModel_ != null;
    }

    public boolean hasDeviceOS() {
        return this.deviceOS_ != null;
    }

    public boolean hasDeviceWidth() {
        return this.deviceWidth_ != null;
    }

    public boolean hasDndMode() {
        return (this.bitField0_ & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0;
    }

    public boolean hasDnt() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFreeSpace() {
        return this.freeSpace_ != null;
    }

    public boolean hasGdprConsent() {
        return this.gdprConsent_ != null;
    }

    public boolean hasGdprString() {
        return this.gdprString_ != null;
    }

    public boolean hasHeadsetPlugged() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHorAccuracy() {
        return this.horAccuracy_ != null;
    }

    public boolean hasIdfa() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdfv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInputLanguages() {
        return this.inputLanguages_ != null;
    }

    public boolean hasIsRingMuted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    public boolean hasLatitude() {
        return this.latitude_ != null;
    }

    public boolean hasLgpdConsent() {
        return this.lgpdConsent_ != null;
    }

    public boolean hasLongitude() {
        return this.longitude_ != null;
    }

    public boolean hasLowPowerMode() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMediationType() {
        return this.mediationType_ != null;
    }

    public boolean hasMobileCountryCode() {
        return this.mobileCountryCode_ != null;
    }

    public boolean hasMobileNetworkCode() {
        return this.mobileNetworkCode_ != null;
    }

    public boolean hasMockResponseId() {
        return (this.bitField0_ & Constants.MIN_PROGRESS_STEP) != 0;
    }

    public boolean hasNetwork() {
        return this.network_ != null;
    }

    public boolean hasOffsetFromGMT() {
        return this.offsetFromGMT_ != null;
    }

    public boolean hasOsVersion() {
        return this.osVersion_ != null;
    }

    public boolean hasPortal() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasPriorSkip() {
        return this.priorSkip_ != null;
    }

    public boolean hasPxRatio() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return this.sdkVersion_ != null;
    }

    public boolean hasSessionDuration() {
        return this.sessionDuration_ != null;
    }

    public boolean hasTimeAccuracy() {
        return this.timeAccuracy_ != null;
    }

    public boolean hasTotalSpace() {
        return this.totalSpace_ != null;
    }

    public boolean hasTrackingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserAge() {
        return this.userAge_ != null;
    }

    public boolean hasUserAgent() {
        return this.userAgent_ != null;
    }

    public boolean hasUserID() {
        return this.userID_ != null;
    }

    public boolean hasVerAccuracy() {
        return this.verAccuracy_ != null;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public boolean hasZipCode() {
        return this.zipCode_ != null;
    }

    public static b newBuilder(TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters) {
        return DEFAULT_INSTANCE.createBuilder(tokenParametersOuterClass$TokenParameters);
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    /* loaded from: classes.dex */
    public enum h implements z.c {
        UNSECURE(0),
        SECURE(1),
        PARTIALLYSECURE(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16712a;

        h(int i10) {
            this.f16712a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16712a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static h a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return PARTIALLYSECURE;
                }
                return SECURE;
            }
            return UNSECURE;
        }
    }

    /* loaded from: classes.dex */
    public enum j implements z.c {
        UNITCONTENTTYPEUNKNOWN(0),
        DISPLAY(1),
        VIDEO(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16718a;

        j(int i10) {
            this.f16718a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16718a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static j a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return VIDEO;
                }
                return DISPLAY;
            }
            return UNITCONTENTTYPEUNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum k implements z.c {
        UNITDISPLAYTYPEUNKNOWN(0),
        BANNER(1),
        INTERSTITIAL(2),
        REWARDED(3),
        MRECT(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16726a;

        k(int i10) {
            this.f16726a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16726a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static k a(int i10) {
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

    /* loaded from: classes.dex */
    public enum l implements z.c {
        UNKNOWN(0),
        MALE(1),
        FEMALE(2),
        OTHER(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16733a;

        l(int i10) {
            this.f16733a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16733a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static l a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return OTHER;
                    }
                    return FEMALE;
                }
                return MALE;
            }
            return UNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum n implements z.c {
        NOCLICK(0),
        CTABUTTON(1),
        COMPANION(2),
        VIDEOVIEW(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f16740a;

        n(int i10) {
            this.f16740a = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f16740a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static n a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return VIDEOVIEW;
                    }
                    return COMPANION;
                }
                return CTABUTTON;
            }
            return NOCLICK;
        }
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i10, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(int i10, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(i10, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(int i10, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(i10, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(int i10, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(i10, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(int i10, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(i10, userSession);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr, q qVar) throws a0 {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
