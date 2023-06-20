package com.vehiclecloud.app.videofetch.rnads.castbox;

import fm.castbox.mediation.SDKManager;
import fm.castbox.mediation.error.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class SdkOnInitializationCompleteListener implements SDKManager.OnInitializationCompleteListener {
    int status = 0;
    ArrayList<Runnable> pendingTasks = new ArrayList<>();

    @Override // fm.castbox.mediation.SDKManager.OnInitializationCompleteListener
    public void onDone() {
        this.status = 1;
        Iterator<Runnable> it = this.pendingTasks.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.pendingTasks.clear();
    }

    @Override // fm.castbox.mediation.SDKManager.OnInitializationCompleteListener
    public void onFailure(AdError adError) {
        this.status = -1;
    }

    @Override // fm.castbox.mediation.SDKManager.OnInitializationCompleteListener
    public void ongoing() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pending(Runnable runnable) {
        this.pendingTasks.add(runnable);
    }
}
