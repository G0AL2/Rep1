package com.ironsource.mediationsdk;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class IntegrationData {
    public String name;
    public String sdkVersion;
    public String version;
    public String[] activities = null;
    public ArrayList<Pair<String, String>> externalLibs = null;
    public String[] services = null;
    public boolean validateWriteExternalStorage = false;
    public String[] providers = null;

    public IntegrationData(String str, String str2) {
        this.name = str;
        this.version = str2;
    }
}
