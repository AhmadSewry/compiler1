package python.symbol;

import java.util.*;

public class SymbolTable {

    private final Deque<Map<String, Symbol>> scopes = new ArrayDeque<>();

    // دخول سكوب جديد
    public void enterScope() {
        scopes.push(new LinkedHashMap<>());
    }

    // خروج من سكوب
    public void exitScope() {
        scopes.pop();
    }

    public boolean define(String name, String type) {
        Map<String, Symbol> current = scopes.peek();

        if (current.containsKey(name)) {
            return false; // إعادة تعريف في نفس السكوب
        }

        current.put(name, new Symbol(name, type));
        return true;
    }


    // البحث عن رمز (من الداخل للخارج)
    public Symbol resolve(String name) {
        for (Map<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }

    // طباعة كل السكوبات
    public void print() {
        int level = scopes.size();

        for (Map<String, Symbol> scope : scopes) {
            System.out.println("Scope level " + level-- + ":");
            for (Symbol s : scope.values()) {
                System.out.println("  " + s.name + " : " + s.type);
            }
        }

    }
}
