package com.google.android.ads.mediationtestsuite.dataobjects;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.ads.mediationtestsuite.BatchAdRequestCallbacks;
import com.google.android.ads.mediationtestsuite.a;
import com.google.android.gms.ads.LoadAdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class BatchAdRequestManager implements a {
    private final Context context;
    private final List<NetworkConfig> networks;
    private final BatchAdRequestCallbacks tester;
    private final HashMap<NetworkConfig, com.google.android.ads.mediationtestsuite.utils.a> networksToLoaders = new HashMap<>();
    private int testedCount = 0;
    private boolean stopTesting = false;

    public BatchAdRequestManager(Context context, Collection<NetworkConfig> collection, BatchAdRequestCallbacks batchAdRequestCallbacks) {
        this.networks = new ArrayList(collection);
        this.tester = batchAdRequestCallbacks;
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                context = contextWrapper.getBaseContext();
            }
        }
        this.context = context;
    }

    private void e() {
        if (this.testedCount < this.networks.size() && !this.stopTesting) {
            NetworkConfig networkConfig = this.networks.get(this.testedCount);
            this.testedCount++;
            if (networkConfig.D()) {
                com.google.android.ads.mediationtestsuite.utils.a aVar = this.networksToLoaders.get(networkConfig);
                if (aVar == null) {
                    aVar = networkConfig.i().g().createAdLoader(networkConfig, this);
                    this.networksToLoaders.put(networkConfig, aVar);
                }
                aVar.e(this.context);
                return;
            }
            this.tester.b(this, networkConfig);
            e();
            return;
        }
        this.tester.a(this);
    }

    @Override // com.google.android.ads.mediationtestsuite.a
    public void a(com.google.android.ads.mediationtestsuite.utils.a aVar, LoadAdError loadAdError) {
        e();
    }

    @Override // com.google.android.ads.mediationtestsuite.a
    public void b(com.google.android.ads.mediationtestsuite.utils.a aVar) {
        e();
    }

    public void c() {
        this.testedCount = 0;
        this.stopTesting = false;
        e();
    }

    public void d() {
        this.stopTesting = true;
        for (com.google.android.ads.mediationtestsuite.utils.a aVar : this.networksToLoaders.values()) {
            aVar.a();
        }
    }
}
