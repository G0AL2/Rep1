package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f8672a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public d(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("networkInfo");
            if (obj instanceof NetworkInfo) {
                return ((NetworkInfo) obj).isConnected();
            }
            return false;
        }
        return false;
    }

    public void a(a aVar) {
        this.f8672a.add(aVar);
    }

    public void b(a aVar) {
        this.f8672a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8672a);
        boolean a10 = a(intent);
        Iterator it = arrayList.iterator();
        if (a10) {
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            return;
        }
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
    }
}
