package com.google.android.ads.mediationtestsuite.dataobjects;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.utils.e;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class NetworkConfig implements Parcelable, Matchable {
    public static final Parcelable.Creator<NetworkConfig> CREATOR = new Parcelable.Creator<NetworkConfig>() { // from class: com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetworkConfig createFromParcel(Parcel parcel) {
            return new NetworkConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetworkConfig[] newArray(int i10) {
            return new NetworkConfig[i10];
        }
    };
    private static int nextConfigId = 1;
    private String adUnitId;
    private NetworkAdapter adapter;
    private ConfigurationItem configurationItem;
    private boolean hasMissingParameters;

    /* renamed from: id  reason: collision with root package name */
    private int f20827id;
    private boolean isRtbAdapter;
    private String label;
    private TestResult lastTestResult;
    private Map<String, String> serverParameters;

    /* renamed from: com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult;

        static {
            int[] iArr = new int[TestResult.values().length];
            $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult = iArr;
            try {
                iArr[TestResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.UNTESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void e() {
        for (String str : this.adapter.l().values()) {
            if (this.serverParameters.get(str) == null) {
                this.hasMissingParameters = true;
            }
        }
    }

    public boolean B() {
        return this.isRtbAdapter;
    }

    public boolean D() {
        if (E()) {
            if (this.isRtbAdapter) {
                return k.l(e.k()) && x();
            }
            return true;
        }
        return false;
    }

    public boolean E() {
        NetworkAdapter networkAdapter = this.adapter;
        if (networkAdapter != null) {
            Network i10 = networkAdapter.i();
            if (this.adapter.n()) {
                return i10 == null || (i10.j() && i10.i());
            }
            return false;
        }
        return false;
    }

    public void F(String str) {
        this.adUnitId = str;
    }

    public void G(ConfigurationItem configurationItem) {
        this.configurationItem = configurationItem;
    }

    public void H(TestResult testResult) {
        TestResult testResult2 = this.lastTestResult;
        this.lastTestResult = testResult;
        if (testResult2 != testResult) {
            e.r(this);
            this.configurationItem.a(Integer.valueOf(this.f20827id));
        }
    }

    public boolean I() {
        return this.lastTestResult == TestResult.SUCCESS;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        String str;
        NetworkAdapter networkAdapter;
        NetworkAdapter networkAdapter2;
        String lowerCase = charSequence.toString().toLowerCase();
        String str2 = this.label;
        return (str2 != null && str2.toLowerCase(Locale.ENGLISH).contains(lowerCase)) || ((str = this.adUnitId) != null && str.toLowerCase(Locale.ENGLISH).contains(lowerCase)) || (((networkAdapter = this.adapter) != null && networkAdapter.f().toLowerCase(Locale.ENGLISH).contains(lowerCase)) || ((networkAdapter2 = this.adapter) != null && networkAdapter2.g().getDisplayString().toLowerCase(Locale.ENGLISH).startsWith(lowerCase)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TestState f() {
        if (D()) {
            int i10 = AnonymousClass2.$SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[this.lastTestResult.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return TestState.f20944f;
                }
                return TestState.f20945g;
            }
            return TestState.f20946h;
        }
        return null;
    }

    public String g() {
        return this.adUnitId;
    }

    public String h() {
        String str;
        return (this.adapter.f().equals(AdUnit.GOOGLE_ADAPTER_CLASS) || (str = this.adUnitId) == null) ? this.configurationItem.b(this) : str;
    }

    public NetworkAdapter i() {
        return this.adapter;
    }

    public TestState j() {
        NetworkAdapter networkAdapter;
        if (!v() && ((networkAdapter = this.adapter) == null || !networkAdapter.n())) {
            return TestState.f20944f;
        }
        return TestState.f20946h;
    }

    public AdapterStatus k() {
        Map<String, AdapterStatus> adapterStatusMap = MobileAds.getInitializationStatus().getAdapterStatusMap();
        if (this.adapter.h() != null) {
            return adapterStatusMap.get(this.adapter.h());
        }
        return null;
    }

    public String l() {
        VersionInfo m10 = i().m();
        if (m10 != null) {
            int microVersion = m10.getMicroVersion();
            return String.format("%d.%d.%d.%d", Integer.valueOf(m10.getMajorVersion()), Integer.valueOf(m10.getMinorVersion()), Integer.valueOf((int) Math.floor(microVersion / 100.0d)), Integer.valueOf(microVersion % 100));
        }
        return null;
    }

    public int m() {
        return this.f20827id;
    }

    public String n() {
        return this.label;
    }

    public TestResult o() {
        return this.lastTestResult;
    }

    public TestState p() {
        Network i10;
        NetworkAdapter networkAdapter = this.adapter;
        if (networkAdapter == null || (i10 = networkAdapter.i()) == null) {
            return null;
        }
        return i10.i() ? TestState.f20946h : TestState.f20944f;
    }

    public String r(Context context) {
        if (!E()) {
            return context.getResources().getString(g.f20885u);
        }
        if (this.isRtbAdapter) {
            boolean l10 = k.l(e.k());
            String string = context.getResources().getString(g.L);
            if (!x()) {
                return context.getResources().getString(g.f20868l0, String.format("<a href=\"%s\">%s</a>", k.d().i(), string));
            } else if (!l10) {
                return context.getResources().getString(g.f20870m0, String.format("<a href=\"%s\">%s</a>", k.d().d(), string));
            }
        }
        return context.getResources().getString(g.f20885u);
    }

    public TestState s() {
        Network i10;
        NetworkAdapter networkAdapter = this.adapter;
        if (networkAdapter == null || (i10 = networkAdapter.i()) == null) {
            return null;
        }
        return i10.j() ? TestState.f20946h : TestState.f20944f;
    }

    public String t() {
        if (v()) {
            return MobileAds.getVersionString();
        }
        VersionInfo k10 = i().k();
        if (k10 != null) {
            return String.format("%d.%d.%d", Integer.valueOf(k10.getMajorVersion()), Integer.valueOf(k10.getMinorVersion()), Integer.valueOf(k10.getMicroVersion()));
        }
        return null;
    }

    public Map<String, String> u() {
        return this.serverParameters;
    }

    public boolean v() {
        return this.adapter.f().equals(AdUnit.GOOGLE_ADAPTER_CLASS);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20827id);
        parcel.writeString(this.label);
        parcel.writeInt(this.lastTestResult.ordinal());
        parcel.writeParcelable(this.adapter, 0);
        parcel.writeInt(this.serverParameters.size());
        for (String str : this.serverParameters.keySet()) {
            parcel.writeString(str);
            parcel.writeString(this.serverParameters.get(str));
        }
        parcel.writeString(this.adUnitId);
    }

    public boolean x() {
        AdapterStatus k10 = k();
        return k10 != null && k10.getInitializationState() == AdapterStatus.State.READY;
    }

    public NetworkConfig(AdFormat adFormat, NetworkResponse networkResponse) {
        this.isRtbAdapter = false;
        this.hasMissingParameters = false;
        int i10 = nextConfigId;
        nextConfigId = i10 + 1;
        this.f20827id = i10;
        this.serverParameters = new HashMap();
        if (networkResponse.c()) {
            this.isRtbAdapter = networkResponse.e();
            Map<String, String> b10 = networkResponse.b();
            if (networkResponse.d()) {
                NetworkAdapter networkAdapter = new NetworkAdapter();
                for (String str : b10.keySet()) {
                    String str2 = b10.get(str);
                    str.hashCode();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -290474766:
                            if (str.equals("class_name")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 102727412:
                            if (str.equals("label")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1954460585:
                            if (str.equals(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            networkAdapter.p(str2);
                            break;
                        case 1:
                            String[] split = str2.split("\\.");
                            networkAdapter.t(String.format(e.k().getString(g.f20851d), split[split.length - 1]));
                            this.label = networkAdapter.j();
                            break;
                        case 2:
                            this.serverParameters.put(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, str2);
                            break;
                    }
                }
                networkAdapter.r(adFormat);
                networkAdapter.l().put(e.k().getString(g.f20878q0), MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                networkAdapter.c();
                this.adapter = networkAdapter;
            } else {
                String a10 = networkResponse.a();
                NetworkAdapterDataStore n10 = e.n();
                NetworkAdapter a11 = n10 == null ? null : n10.a(adFormat, this.isRtbAdapter, a10);
                this.adapter = a11;
                this.serverParameters = b10;
                if (a11 != null) {
                    e();
                    this.label = this.adapter.i().h();
                }
            }
            this.lastTestResult = TestResult.UNTESTED;
            if (this.adapter == null || D()) {
                return;
            }
            this.lastTestResult = TestResult.FAILURE_UNABLE_TO_TEST;
        }
    }

    private NetworkConfig(Parcel parcel) {
        this.isRtbAdapter = false;
        this.hasMissingParameters = false;
        this.f20827id = parcel.readInt();
        this.label = parcel.readString();
        this.lastTestResult = TestResult.values()[parcel.readInt()];
        this.adapter = (NetworkAdapter) parcel.readParcelable(NetworkAdapter.class.getClassLoader());
        this.serverParameters = new HashMap();
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.serverParameters.put(parcel.readString(), parcel.readString());
        }
        this.adUnitId = parcel.readString();
    }
}
