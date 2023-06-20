package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.utils.e;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ConfigurationItem {
    protected TestState adapterTestState;
    protected TestState manifestTestState;
    protected TestState sdkTestState;

    /* JADX INFO: Access modifiers changed from: protected */
    public ConfigurationItem() {
        TestState testState = TestState.f20946h;
        this.sdkTestState = testState;
        this.adapterTestState = testState;
        this.manifestTestState = testState;
    }

    public void a(Integer num) {
        if (j() || l()) {
            e.g(this);
        }
    }

    public abstract String b(NetworkConfig networkConfig);

    public TestState d() {
        return this.adapterTestState;
    }

    public abstract String e();

    public TestState f() {
        return this.manifestTestState;
    }

    public abstract String g();

    public abstract List<NetworkConfig> h();

    public TestState i() {
        return this.sdkTestState;
    }

    public boolean j() {
        if (k()) {
            return false;
        }
        for (NetworkConfig networkConfig : h()) {
            if (networkConfig.o() != TestResult.SUCCESS) {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        int k10 = TestState.f20946h.k();
        return this.adapterTestState.k() < k10 || this.manifestTestState.k() < k10 || this.sdkTestState.k() < k10;
    }

    public boolean l() {
        for (NetworkConfig networkConfig : h()) {
            if (networkConfig.o().isFailure()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(NetworkConfig networkConfig) {
        Network i10 = networkConfig.i().i();
        if (networkConfig.j().k() < this.adapterTestState.k()) {
            this.adapterTestState = networkConfig.j();
        }
        if (i10 != null && !i10.j()) {
            this.sdkTestState = TestState.f20944f;
        }
        if (i10 == null || i10.i()) {
            return;
        }
        this.manifestTestState = TestState.f20944f;
    }
}
