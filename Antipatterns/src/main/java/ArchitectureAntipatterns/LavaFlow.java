package ArchitectureAntipatterns;

public class LavaFlow {
    // Antipattern
    class LegacySystem {
        void processData() {
            // Old, unmaintainable code mixed with new code
            oldMethod();  // No one knows what this does
            newMethod();  // New implementation
        }
    }

    // Better Solution
    class ModernSystem {
        private LegacyAdapter legacyAdapter;

        void processData() {
            // Clear separation of concerns
            legacyAdapter.processLegacyData();
            processModernData();
        }
    }
}
