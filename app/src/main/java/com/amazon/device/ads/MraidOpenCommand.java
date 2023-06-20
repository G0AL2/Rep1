package com.amazon.device.ads;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidOpenCommand extends MraidCommand {
    static final String NAME = "open";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMraidName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.openUrl(jSONObject.getString(ImagesContract.URL));
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return NAME;
    }
}
