package com.example.vocabdiary.util;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class FirestoreRepository {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();

    // Firestore 연결 테스트
    public void saveTestData() {

        Map<String, Object> sample = new HashMap<>();
        sample.put("message", "Firestore Test OK");
        sample.put("timestamp", System.currentTimeMillis());

        db.collection("testCollection")
                .add(sample)
                .addOnSuccessListener(ref ->
                        System.out.println("Firestore 저장 성공 → " + ref.getId())
                )
                .addOnFailureListener(e ->
                        System.out.println("Firestore 저장 실패 → " + e.getMessage())
                );
    }
}
