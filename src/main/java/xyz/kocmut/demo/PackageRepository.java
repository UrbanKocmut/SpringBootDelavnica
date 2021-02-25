package xyz.kocmut.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface PackageRepository extends JpaRepository<Package,Integer> {
}
