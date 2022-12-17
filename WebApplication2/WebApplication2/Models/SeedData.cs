using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection;
using ExamEmployee.Data;
using System;
using System.Linq;
namespace ExamEmployee.Models
{
    public static class SeedData
    {
        public static void Initialize(IServiceProvider serviceProvider)
        {
            using (var context = new ExamEmployeeContext(
                serviceProvider.GetRequiredService<
                    DbContextOptions<ExamEmployeeContext>>()))
            {
                // Look for any movies.
                if (context.Employee.Any())
                {
                    return;   // DB has been seeded
                }
                context.Employee.AddRange(
                    new Employee
                    {
                        Title = "Truong",
                        ReleaseDate = DateTime.Parse("1231-13-11"),
                        Derpartment = "HR",
                        Salary = 7.99M
                    },
                    new Employee
                    {
                        Title = "Tan",
                        ReleaseDate = DateTime.Parse("1111-10-11"),
                        Derpartment = "SC",
                        Salary = 7.99M
                    },
                    new Employee
                    {
                        Title = "Tran",
                        ReleaseDate = DateTime.Parse("1989-1-12"),
                        Derpartment = "LD",
                        Salary = 7.99M
                    }
                  

                );
                context.SaveChanges();
            }
        }
    }
}