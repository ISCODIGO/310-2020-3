Conjunto c1 = new Conjunto(10);

c1.agregar(1);
c1.agregar(2);
c1.agregar(5);

Conjunto c2 = new Conjunto(10);
c2.agregar(7);
c2.agregar(8);
c2.agregar(9);

Conjunto c3 = c1.union(c2);

// Llamando a toString, indirectamente

c3.universo[0] = true;

print(c3);
