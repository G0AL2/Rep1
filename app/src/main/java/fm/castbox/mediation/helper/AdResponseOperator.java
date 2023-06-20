package fm.castbox.mediation.helper;

import android.os.Build;
import android.util.Log;
import ed.c;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.helper.UBCReportor;
import fm.castbox.mediation.http.DisplayNotificationListener;
import fm.castbox.mediation.http.HttpClient;
import fm.castbox.mediation.model.DisplayResult;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes3.dex */
public class AdResponseOperator {
    private static final String TAG = "AdResponseOperator";
    private UBCReportor ubcReportor;
    private final Stack<CompoundEntity> stack = new Stack<>();
    private CompoundEntity activeEntity = null;

    /* loaded from: classes3.dex */
    public static class AdDisplayRequestPayload {
        @c("inventory_id")
        private final String inventoryId;
        @c("request_id")
        private final String requestId;
        @c("results")
        private final List<DisplayResult> results;

        /* loaded from: classes3.dex */
        public static class Builder {
            private String inventoryId;
            private String requestId;
            private final List<DisplayResult> results = new ArrayList();

            public Builder append(DisplayResult displayResult) {
                if (displayResult == null) {
                    Log.w(AdResponseOperator.TAG, "no display result can be returned");
                } else {
                    this.results.add(displayResult);
                }
                return this;
            }

            public AdDisplayRequestPayload build() {
                return new AdDisplayRequestPayload(this.requestId, this.inventoryId, this.results);
            }

            public Builder setInventoryId(String str) {
                this.inventoryId = str;
                return this;
            }

            public Builder setRequestId(String str) {
                this.requestId = str;
                return this;
            }
        }

        public AdDisplayRequestPayload(String str, String str2, List<DisplayResult> list) {
            this.requestId = str;
            this.inventoryId = str2;
            this.results = list;
        }

        public String toString() {
            return "AdDisplayRequestPayload{requestId='" + this.requestId + "', inventoryId='" + this.inventoryId + "', results=" + this.results + '}';
        }
    }

    /* loaded from: classes3.dex */
    public static class CompoundEntity {
        private final Bid bid;
        private final Waterfall waterfall;

        public CompoundEntity(Bid bid, Waterfall waterfall) {
            this.bid = bid;
            this.waterfall = waterfall;
        }

        public Bid getBid() {
            return this.bid;
        }

        public DisplayResult getDisplayResult(boolean z10) {
            Bid bid = this.bid;
            if (bid != null) {
                return bid.getDisplayResult(z10);
            }
            Waterfall waterfall = this.waterfall;
            if (waterfall != null) {
                return waterfall.getDisplayResult(z10);
            }
            return null;
        }

        public float getEcpm() {
            Waterfall waterfall = this.waterfall;
            if (waterfall != null) {
                return waterfall.getEcpm();
            }
            Bid bid = this.bid;
            if (bid != null) {
                return bid.getEcpm();
            }
            return 0.0f;
        }

        public Waterfall getWaterfall() {
            return this.waterfall;
        }

        public boolean isBid() {
            return this.bid != null;
        }

        public boolean isWaterfall() {
            return this.waterfall != null;
        }

        public String toString() {
            Waterfall waterfall = this.waterfall;
            if (waterfall != null) {
                return String.format("CompoundEntity{%s}", waterfall.toString());
            }
            Bid bid = this.bid;
            return bid != null ? String.format("CompoundEntity{%s}", bid.toString()) : "CompoundEntity{}";
        }
    }

    public AdResponseOperator() {
        UBCReportor uBCReportor = new UBCReportor();
        this.ubcReportor = uBCReportor;
        uBCReportor.setAdResponseOperator(this);
    }

    private List<CompoundEntity> getSortedCompoundEntities(List<Bid> list, List<Waterfall> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Bid bid : list) {
                arrayList.add(new CompoundEntity(bid, null));
            }
        }
        if (list2 != null) {
            for (Waterfall waterfall : list2) {
                arrayList.add(new CompoundEntity(null, waterfall));
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.sort(new Comparator<CompoundEntity>() { // from class: fm.castbox.mediation.helper.AdResponseOperator.1
                @Override // java.util.Comparator
                public int compare(CompoundEntity compoundEntity, CompoundEntity compoundEntity2) {
                    if (compoundEntity.getEcpm() < compoundEntity2.getEcpm()) {
                        return -1;
                    }
                    return compoundEntity.getEcpm() > compoundEntity2.getEcpm() ? 1 : 0;
                }
            });
        } else {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    CompoundEntity compoundEntity = (CompoundEntity) arrayList.get(i10);
                    CompoundEntity compoundEntity2 = (CompoundEntity) arrayList.get(i12);
                    if (compoundEntity.getEcpm() < compoundEntity2.getEcpm()) {
                        arrayList.set(i10, compoundEntity2);
                        arrayList.set(i12, compoundEntity);
                    }
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public synchronized void UBC(UBCReportor.UBCCategory uBCCategory) {
        UBCReportor uBCReportor = this.ubcReportor;
        if (uBCReportor == null) {
            Log.i(TAG, "ubc reportor is not constructed yet");
        } else {
            uBCReportor.meter(uBCCategory);
        }
    }

    public synchronized void clear() {
        this.activeEntity = null;
        this.stack.clear();
    }

    public CompoundEntity getActiveEntity() {
        return this.activeEntity;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public CompoundEntity pop() {
        try {
            if (this.stack.isEmpty()) {
                this.activeEntity = null;
            } else {
                this.activeEntity = this.stack.pop();
            }
        } catch (Exception unused) {
            this.activeEntity = null;
        }
        String str = TAG;
        Log.i(str, "active entity belongs to " + this.activeEntity);
        return this.activeEntity;
    }

    public synchronized void reportDisplayResult(String str, String str2, boolean z10) {
        if (getActiveEntity() == null) {
            Log.w(TAG, "no active entity here");
            return;
        }
        AdDisplayRequestPayload.Builder builder = new AdDisplayRequestPayload.Builder();
        builder.setRequestId(str).setInventoryId(str2);
        CompoundEntity activeEntity = getActiveEntity();
        if (!z10) {
            builder.append(activeEntity.getDisplayResult(false));
        } else {
            builder.append(activeEntity.getDisplayResult(true));
            if (activeEntity.isBid()) {
                activeEntity.getBid().kickoffAdDisplayNotification();
            }
            Iterator<CompoundEntity> it = this.stack.iterator();
            while (it.hasNext()) {
                builder.append(it.next().getDisplayResult(false));
            }
        }
        AdDisplayRequestPayload build = builder.build();
        String str3 = TAG;
        Log.d(str3, "AdDisplay: " + build.toString());
        HttpClient.getInstance().fulfillAdDisplay(build, new DisplayNotificationListener() { // from class: fm.castbox.mediation.helper.AdResponseOperator.2
            @Override // fm.castbox.mediation.http.DisplayNotificationListener
            public void onFailure(AdError adError) {
                String str4 = AdResponseOperator.TAG;
                Log.i(str4, "AdDisplay: " + adError.toString());
            }

            @Override // fm.castbox.mediation.http.DisplayNotificationListener
            public void onSuccess() {
                Log.i(AdResponseOperator.TAG, "AdDisplay: succeeded");
            }
        });
    }

    public synchronized void setContent(String str, List<Bid> list, List<Waterfall> list2) {
        clear();
        this.ubcReportor.setResponsePayload(str, list, list2);
        for (CompoundEntity compoundEntity : getSortedCompoundEntities(list, list2)) {
            this.stack.push(compoundEntity);
        }
    }
}
