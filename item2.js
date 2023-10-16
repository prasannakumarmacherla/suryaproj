function generatePassword(length) {
    // Define character sets
    const uppercaseChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    const lowercaseChars = 'abcdefghijklmnopqrstuvwxyz';
    const numberChars = '0123456789';
    const specialChars = '!@#$%^&*()-=_+[]{}|;:,.<>?';
  
    // Combine character sets
    const allChars = uppercaseChars + lowercaseChars + numberChars + specialChars;
  
    let password = '';
  
    // Generate password
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * allChars.length);
      password += allChars.charAt(randomIndex);
    }
  
    return password;
  }
  
  // Example: Generate a password with length 12
  const newPassword = generatePassword(12);
  console.log(newPassword);
  