/// <reference types="vitest" />
import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";
import path from "path";

export default defineConfig({
    plugins: [react()],
    test: {
        globals: true,
        environment: 'jsdom',
    },
    build: {
        outDir: "./build",
        emptyOutDir: true,
        rollupOptions: {
            input: path.resolve(import.meta.dirname, 'index.html'),
            output: {
                entryFileNames: 'static/js/main.js',
                chunkFileNames: 'static/js/main.js',
                assetFileNames: ({ names }) => {
                    const filename = Array.isArray(names) ? names[names.length - 1] : names;

                    if (filename && filename.endsWith('.css')) {
                        return 'static/css/main.min.css';
                    }
                    return 'static/[name]-[hash][extname]';
                }
            }
        }
    }
});